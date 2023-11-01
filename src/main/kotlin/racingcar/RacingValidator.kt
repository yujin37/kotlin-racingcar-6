package racingcar

class RacingValidator {
    fun validateCarName(checkName: String) {
        if(checkName.isEmpty() || checkName.length > 5 || checkName == " ") {
            throw IllegalArgumentException()
        }
    }
    fun inputCars(cars: String): List<String> {
        val racingCars = cars.split(',')
        for(racingCar in racingCars){
            validateCarName(racingCar)
        }
        return racingCars
    }
    fun trying(tries: String): Int {
        if(tries.isEmpty()){
            throw IllegalArgumentException()
        }
        return tries.toInt()
    }
}