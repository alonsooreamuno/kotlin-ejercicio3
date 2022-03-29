package model

class Repartidor:Empleado {

    var zona:String
    constructor():super(){
        this.zona = ""
    }

    constructor(zona_:String,nombre_:String,edad_:Int,salario_:Double):super(nombre_,edad_,salario_){
        this.zona = zona_
    }

    override fun plus() {
        if(this.edad < 25 && this.zona === "zona 3") {
            this.salario = +this.salario + PLUS
            super.plus()
        }
    }
}