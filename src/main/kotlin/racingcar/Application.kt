package racingcar

import camp.nextstep.edu.missionutils.Console

class RacingCarValidator {
    fun validateCarName(checkName: String) {
        if(checkName.isEmpty() || checkName.length > 5) {
            throw IllegalArgumentException()
        }
    }
    fun inputCars(): List<String> {
        val cars = Console.readLine()
        val racingCars = cars.split(',')
        for(racingCar in racingCars){
            RacingCarValidator().validateCarName(racingCar)
        }
        return racingCars
    }
    fun trying(): Int {
        println("시도 할 횟수는 몇 회인가요?")
        val trying = Console.readLine()
        return trying.toInt()
    }
}
fun main() {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분")
    val racingCars = RacingCarValidator().inputCars()
    val trying = RacingCarValidator().trying()
    RacingGames().checkTime(racingCars, trying)
}
