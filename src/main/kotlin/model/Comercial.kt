package model


class Comercial:Empleado {
    var comision:Double

    constructor():super(){
        this.comision = 0.0
    }
    constructor(comision_:Double,nombre_:String,edad_:Int,salario_:Double):super(nombre_,edad_,salario_){
        this.comision = comision_
    }

    override fun plus() {
        if(this.edad > 30 && this.comision > 200) {
            this.salario = +this.salario + PLUS
            super.plus()
        }
    }
}