// network-graph.js

// Función para obtener las ramas del repositorio desde la API de GitHub
function getBranches() {
  const owner = 'nombre_del_propietario';
  const repo = 'nombre_del_repositorio';
  const token = 'TU_TOKEN_DE_ACCESO';

  return fetch(`https://api.github.com/repos/${owner}/${repo}/branches`, {
    headers: {
      Authorization: `Bearer ${token}`,
    },
  })
    .then(response => response.json())
    .then(data => data);
}

// Función para crear y mostrar el gráfico de red
function createNetworkGraph(branches) {
  // Procesa los datos de las ramas y crea un conjunto de nodos y enlaces
  const nodes = branches.map(branch => ({
    id: branch.name,
    name: branch.name,
  }));

  const links = [];
  // Puedes crear enlaces entre las ramas según las relaciones que desees representar.

  // Luego, procede a construir el gráfico de red con estos datos.
  const width = 800;
  const height = 400;

  const svg = d3.select("#network-graph")
    .append("svg")
    .attr("width", width)
    .attr("height", height);

  const simulation = d3.forceSimulation(nodes)
    .force("link", d3.forceLink(links).id(d => d.id))
    .force("charge", d3.forceManyBody().strength(-100))
    .force("center", d3.forceCenter(width / 2, height / 2));

  const link = svg.selectAll("line")
    .data(links)
    .enter()
    .append("line")
    .attr("stroke", "#999")
    .attr("stroke-opacity", 0.6);

  const node = svg.selectAll("circle")
    .data(nodes)
    .enter()
    .append("circle")
    .attr("r", 10)
    .attr("fill", "blue");

  simulation.on("tick", () => {
    link
      .attr("x1", d => d.source.x)
      .attr("y1", d => d.source.y)
      .attr("x2", d => d.target.x)
      .attr("y2", d => d.target.y);

    node
      .attr("cx", d => d.x)
      .attr("cy", d => d.y);
  });
}

// Llamada a la función para obtener las ramas y crear el gráfico de red
getBranches().then(branches => {
  createNetworkGraph(branches);
});
