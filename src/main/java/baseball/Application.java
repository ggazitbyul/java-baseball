package baseball;

import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        List<String> computerNumber = createRandomNumber();
        System.out.println(computerNumber); // 출력 확인용 임시
        System.out.println("숫자를 입력해주세요 : ");
        List<String> userNumber = readUserNumber();
        System.out.println(userNumber); // 출력 확인용 임시
    }

    private static List<String> createRandomNumber() {
        List<String> randomNumberList = new ArrayList<>();
        while (randomNumberList.size() < 3) {
            String randomNumber = String.valueOf(Randoms.pickNumberInRange(1, 9));
            if (!randomNumberList.contains(randomNumber)) {
                randomNumberList.add(randomNumber);
            }
        }
        return randomNumberList;
    }

    private static List<String> readUserNumber() {
        String readWord = Console.readLine();
        List<String> userNumberList = new ArrayList<>(List.of(readWord.split("")));

        return userNumberList;
    }
}

