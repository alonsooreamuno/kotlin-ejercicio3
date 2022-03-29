import model.Comercial
import model.Repartidor

fun main(args: Array<String>) {

    val comercial1:Comercial = Comercial(299.0,"Alonso",31,2500.0)
    val comercial2:Comercial = Comercial(250.0,"Kevin",24,1500.0)
    val repartidor1:Repartidor = Repartidor("zona 3","Vale",30,3400.0)
    val repartidor2:Repartidor = Repartidor("zona 3","Joe",24,3000.0)

    comercial1.plus()
    comercial2.plus()
    repartidor1.plus()
    repartidor2.plus()

}