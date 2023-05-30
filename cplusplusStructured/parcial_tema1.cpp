#include <iostream>
#define CANT_CLASES 16
using namespace std;

struct Nota {
    int legajo;
    char nota;
};

struct Asistencia {
    int legajo;
    int fecha;
    bool presente;
};

struct STR_DATO {
    int legajo;
    char notas; 
    char cantNotas; 
};

struct STR_NODO {
    STR_DATO dato;
    STR_NODO *siguiente;
};

struct Promocion {
    int legajo;
    float promedio;
    char presentismo;
};

FILE *abrir(const char *fileName, const char *modo)
{
    FILE *file = fopen(fileName, modo);
    if (file == NULL)
    {
        fprintf(stderr, "No se pudo abrir el archivo: %s", fileName);
        exit(EXIT_FAILURE);
    }

    return file;
}
void cerrar(FILE * file) {
    fclose(file);
    file = NULL;
}

int leerNota(Nota *registro, FILE * file) {
    return fread(registro, sizeof(Nota), 1, file);
}

int leerAsistencia(Asistencia *registro, FILE * file) {
    return fread(registro, sizeof(Asistencia), 1, file);
}

int escribirPromocion(Promocion registro, FILE *file) {
    return fwrite(&registro, sizeof(Promocion), 1, file);
}

STR_NODO *search(STR_NODO *lista, int legajo)
{
    while (lista && lista->dato.legajo != legajo)
    {
        lista = lista->siguiente;
    }
    return lista;
}

STR_NODO* insertOrdered(STR_DATO valor, STR_NODO **lista) {
    STR_NODO* nodo = (STR_NODO *) malloc(sizeof(STR_NODO));
    nodo->dato = valor;
    nodo->siguiente = NULL;

    STR_NODO *listaAux = *lista;
    STR_NODO *nodoAnt = NULL;
    while(listaAux != NULL && listaAux->dato.legajo < valor.legajo) {
        nodoAnt = listaAux;
        listaAux = listaAux->siguiente;
    }

    if(nodoAnt == NULL) {
        *lista = nodo;
    } else {
        nodoAnt->siguiente = nodo;
    }

    nodo->siguiente = listaAux;
    return nodo;
}

STR_DATO deleteFirst(STR_NODO **lista) {
    STR_NODO *nodoAux = *lista;
    *lista = (*lista)->siguiente;
    STR_DATO dato = nodoAux->dato;
    free(nodoAux);
    return dato;
}

int main () {

    FILE *aprobadosFile = abrir("NotasAprobados.dat","rb");
    FILE *asistencias = abrir("Asistencias.dat", "rb");
    FILE *promocionan = abrir("Promocionan.dat", "wb");

    Nota nota;
    STR_NODO *aprobados = NULL;
    leerNota(&nota, aprobadosFile);
    while(!feof(aprobadosFile)) {
        STR_NODO *alumno = search(aprobados, nota.legajo);
        if(alumno == NULL) {
            STR_DATO dato;
            dato.legajo = nota.legajo;
            dato.notas = nota.nota;
            dato.cantNotas = 1;
            insertOrdered(dato, &aprobados);
        } else { 
            alumno->dato.notas += nota.nota;
            alumno->dato.cantNotas++;
        }
        leerNota(&nota, aprobadosFile);
    }
    int promocionados = 0;
    int total = 0;
    Asistencia asistencia;
    leerAsistencia(&asistencia, asistencias);
    while(!feof(asistencias)) {
        int key = asistencia.legajo;
        int presentes = 0;
        while(!feof(asistencias) && key == asistencia.legajo) {
            if(asistencia.presente) {
                presentes++;
            }
            leerAsistencia(&asistencia, asistencias);
        }
        total++;
        STR_DATO aprobado = deleteFirst(&aprobados);
        float prom = (float) aprobado.notas / aprobado.cantNotas;
        if ( prom >= 8) {
            if(presentes > CANT_CLASES * 0.8) {
                Promocion promocionado;
                promocionado.legajo = aprobado.legajo;
                promocionado.promedio = prom;
                promocionado.presentismo = presentes;
                escribirPromocion(promocionado, promocionan);
                promocionados++;
            } else {
                printf("Alumno con buen promedio pero sin 80%: %d\n", aprobado.legajo);
            }
        }

    }

    printf("Porcentaje de promocionados sobre total %d%", (float) promocionados / total);

    cerrar(aprobadosFile);
    cerrar(asistencias);
    cerrar(promocionan);
system("pause");
 return 0;
}