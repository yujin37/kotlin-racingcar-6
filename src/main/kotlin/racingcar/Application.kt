package racingcar

import camp.nextstep.edu.missionutils.Console

class RacingValidator {
    fun validateCarName(checkName: String) {
        if(checkName.isEmpty() || checkName.length > 5) {
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
fun main() {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분")
    val racingCars = RacingValidator().inputCars(Console.readLine())
    println("시도 할 횟수는 몇 회인가요?")
    val trying = RacingValidator().trying(Console.readLine())
    RacingGames().checkTime(racingCars, trying)
}
