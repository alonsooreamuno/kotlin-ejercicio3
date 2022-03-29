package model

val PLUS:Int = 300

open class Empleado {
    var nombre:String
    var edad:Int
    var salario:Double

    constructor(){
        this.nombre=""
        this.edad = 0
        this.salario=0.0
    }

    constructor(nombre_:String,edad_:Int,salario_:Double){
        this.nombre=nombre_
        this.edad = edad_
        this.salario= salario_
    }

    open fun plus(){
        println("Aumento realizado a "+ this.nombre + " -> Nuevo salario: "+this.salario)
    }


}