# firstRepUTN
most exercises

### honey bear note(?
#### (just a nice reminder in spanish)

Cada vez que uno hace cambios y actualiza la rama dev con un pull request se deben realizar los siguientes pasos:

#### si sos el de la rama que hizo pull request, simplemente haces lo siguiente:

-Luego del pull request, te paras en dev y haces un git pull. Lo mismo parado en tu rama.
> git checkout dev
> git pull
> git checkout turama
> git pull

-Parado sobre tu rama, agarras y haces: 
> git merge dev
> git push origin turama

Luego de esto si haces cambios es lo mismo de siempre y tu rama va a seguir igual, simplemente la pusiste a la altura de dev junto con sus cambios si es que había.

#### si otra persona hizo pull request

-Actualízate dev
> git checkout dev
> git pull

-Actualízate tu rama con los cambios de dev que metio la otra persona con el pull request
> git checkout turama
> git pull (por las dudas)
> git merge dev
> git push origin turama

y lo mismo de antes, aca seguís comiteando como si nada.