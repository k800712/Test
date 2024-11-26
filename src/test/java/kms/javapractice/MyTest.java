package kms.javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class MyTest {

    private Integer getSum;

    @Test
    void 스트링테스트() {

        String s = "hello";
        assertThat(s.length()).isEqualTo(5);
        assertThat("".length()).isEqualTo(0);
    }

    @Test
    void isEmpty() {
        String s = "hello";
        assertThat(s.isEmpty()).isFalse();

    }

    @Test
    void equals() {
        String s = "hello";
        assertThat(s.equals("hello")).isTrue();
    }

    @Test
    void CharAt() {
        String s = "hello";
        assertThat(s.charAt(1)).isEqualTo('e');  //해당 칸에 글자 확인

    }

    @Test
    void toLowerCase() {
        String s = "Hello!22";

        assertThat(s.toLowerCase()).isEqualTo("hello!22"); //소문자로 변환

    }

    @Test
    void toUpperCase() {
        String s = "Hello!22";

        assertThat(s.toUpperCase()).isEqualTo("HELLO!22"); //대문자로 변환

    }

    @Test
    void contains() {
        String s = "Hello";

        assertThat(s.contains("Hello")).isTrue();

    }

    @Test
    void startSwith() {
        String s = "Hello";
        assertThat(s.startsWith("E")).isFalse();

    }

    @Test
    void endsWith() {
        String s = "Hello";
        assertThat(s.endsWith("l")).isFalse();

    }

    @Test
    void repeat() {
        String s = "Hello";
        assertThat(s.repeat(3)).isEqualTo("HelloHelloHello");

    }

    @Test
    void indexOf() {
        String s = "Hello";
        assertThat(s.indexOf("e")).isEqualTo(1);
    }

    @Test
    void concat() {
        String s = "Hello";
        assertThat(s.concat("p")).isEqualTo("Hellop");

    }

    @Test
    void Math() {

        int score = 100;
        Math.max(score, 20);
        assertThat(Math.max(score, 20)).isEqualTo(100);
        assertThat(Math.min(score, 30)).isEqualTo(30);

    }

    @Test
    void Method() {
        "min".concat("sung")
                .concat(",")
                .concat("kim");

    }

    @Test
    void subStringTest() {

        String url = "www.naver.com";
        String result = url.substring(0, 8);
        System.out.println("result= " + result);

        String formatted = String.format("안녕하세요. %d년생 %s입니다.", 80, "김민성");
        assertThat(formatted).isEqualTo("안녕하세요. 80년생 김민성입니다.");
        System.out.println(formatted);

    }

    @Test
    void email() {

        assertThat(isValidEmail("doraemon@gmail.com")).isTrue();
        assertThat(isValidEmail("doraemon")).isFalse();
    }

    boolean isValidEmail(String email) {

        return email.contains("@") && email.contains(".com");


    }

    @Test
    void 주민번호() {

        String s = "1234567";
        assertThat(s.charAt(0)).isEqualTo('1');

        if (s.charAt(0) == '1') {
            // 남자

        }

    }

    boolean isFemale(String number) {

//        return number.startsWith("2") || number.startsWith("4");  // 여자
        char first = number.charAt(0);
        if (first == '2' || first == '4') {
            return true;
        }
        return false;
    }


    @Test
    void id() {

        String s = "1234567";
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))) {

            }


    }

    boolean isValidIdNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                //  continue;
            } else {
                return false;
            }
        }
        return true;
    }

    @Test
    void Snake() {

        assertThat(toCamelCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCamelCase("product_name")).isEqualTo("productName");
        assertThat(toCamelCase("created_at")).isEqualTo("createdAt");
    }

    String toCamelCase(String snake) {
        int indexOfUnderscore = snake.indexOf("_");
        String firstPart = snake.substring(0, indexOfUnderscore);
        String secondPart = snake.substring(indexOfUnderscore + 1);
        String firstLetterOfSecondPart = secondPart.substring(0, 1).toUpperCase();
        String restOfSecondPart = secondPart.substring(1);

        return firstPart.concat(firstLetterOfSecondPart).concat(restOfSecondPart);
    }

    @Test
    void calculateArea() {

        double side = 5.0;
        calculateArea(side);
        calculateArea(10.0);
        System.out.println(calculateArea(10.0));

        calculateArea(10, 20);
        System.out.println(calculateArea(10, 20));

        calculateArea(10, true);
        System.out.println(calculateArea(10, true));

        assertThat(calculateArea(10.0)).isEqualTo(100);
        assertThat(calculateArea(10, 20)).isEqualTo(200);


    }

    /**
     * 다음 도형들의 면적을 계산하는 메서드를 오버로딩하여 구현하세요:
     * 1. 정사각형
     * 2. 직사각형
     * 3. 원
     *
     * @param side 정사각형의 한 변의 길이
     * @return 정사각형의 면적
     */
    double calculateArea(double side) {
        // TODO: 정사각형 면적 계산 로직을 구현하세요.

        return side * side;
    }

    /**
     * @param length 직사각형의 길이
     * @param width  직사각형의 너비
     * @return 직사각형의 면적
     */
    double calculateArea(double length, double width) {
        // TODO: 직사각형 면적 계산 로직을 구현하세요.
        return length * width;
    }

    /**
     * @param radius 원의 반지름
     * @return 원의 면적
     */
    double calculateArea(double radius, boolean isCircle) {
        // TODO: 원의 면적 계산 로직을 구현하세요. isCircle 매개변수는 오버로딩을 위해 사용됩니다.
        return Math.PI * radius * radius;
    }

    @Test
    void isValidPhoneNumberTest() {

        assertThat(isValidPhoneNumber("01012345678")).isTrue();
        assertThat(isValidPhoneNumber("010123456789")).isFalse();
        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();
    }

    boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.startsWith("010")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Test
    void extractDomain() {

        assertThat(extractDomain("https://git-scm.com/book/en/v2")).isEqualTo("git-scm.com");
        assertThat(extractDomain("https://www.google.com/search?q=java")).isEqualTo("www.google.com");
        assertThat(extractDomain("https://www.op.gg/modes/aram/teemo/build?region=global&tier=all")).isEqualTo("www.op.gg");
    }

    String extractDomain(String url) {
        String protocol = "http://";
        return url.substring(protocol.length(), url.indexOf("/", protocol.length()));

    }

    @Test
    void isValidPassWord() {

        String password = "!@#$%^&*()";
        {
            // 대문자
            boolean hasUpperCase = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                }
            }
            if (!hasUpperCase) {

            }

            // 소문자
            boolean hasLowerCase = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    hasLowerCase = true;
                }
            }
            if (!hasLowerCase) {
                ;
            }

            // 숫자
            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                }
            }
            if (!hasDigit) {

            }

            // 특수문자
            String specialChars = "!@#$%^&*()";
            boolean hasSpecialChar = false;
            for (int i = 0; i < password.length(); i++) {
                if (specialChars.contains(String.valueOf(password.charAt(i)))) {
                    hasSpecialChar = true;
                }
            }
            if (!hasSpecialChar) {

            }


        }


    }

    @Test
    void arrayList() {

        ArrayList<String> 광역시목록 = new ArrayList<>();

        광역시목록.add("대전");
        광역시목록.add("일산");
        광역시목록.add("광주");
        광역시목록.add("울산");

        for (String s : 광역시목록) {

            System.out.println(s);


        }
        광역시목록.get(2);
        System.out.println("-------------------");
        System.out.println(광역시목록.get(1));

        for (String 지역 : 광역시목록) {

            System.out.println("-------------------");
            System.out.println("지역 = " + 지역);
        }
        광역시목록.set(2, "전라도 광주");  // index 3의 데이터를 "전라도 광주"으로 수정
        System.out.println("-------------------");
        System.out.println(광역시목록.set(2, "전라도 광주"));

        광역시목록.remove(1); // index 1의 "수박"이 제거됨

        System.out.println("-------------------");
        System.out.println(광역시목록);


        ArrayList<String> 광역시목록2 = new ArrayList<>();

        for (String 지역 : 광역시목록) {

            광역시목록2.add(지역 + "광역시");

        }

        System.out.println(광역시목록2);


    }

    @Test
    void arrayListTest() {

        ArrayList<Integer> 수학점수 = new ArrayList<>();

        수학점수.add(80);
        수학점수.add(60);
        수학점수.add(70);
        수학점수.add(100);
        수학점수.add(90);


        int sum = 0;
        for (int i = 0; i < 수학점수.size(); i++) {

            sum += 수학점수.get(i);

        }
        System.out.println("총점 = " + sum);

        int average = 0;
        for (int e = 0; e < 수학점수.size(); e++) {

            average = sum / 수학점수.size();

        }

        System.out.println("평균 점수 = " + average);


        int maxList = 0;
        for (int i = 0; i < 수학점수.size(); i++) {

            if (수학점수.get(i) >= maxList) {

                maxList = 수학점수.get(i);
            }

        }
        System.out.println("최고 점수 = " + maxList);

        int minList = 수학점수.get(0);

        for (int i = 0; i < 수학점수.size(); i++) {

            if (수학점수.get(i) <= minList) {

                minList = 수학점수.get(i);
            }

        }
        System.out.println("최저 점수 = " + minList);


        ArrayList<Integer> 평균이하 = new ArrayList<>();

        for (int i = 0; i < 수학점수.size(); i++) {

            if (수학점수.get(i) <= average) {

                평균이하.add(수학점수.get(i));

            }

        }
        System.out.println("평균이하 점수 = " + 평균이하);

        ArrayList<Integer> 평균이상 = new ArrayList<>();

        for (int i = 0; i < 수학점수.size(); i++) {

            if (수학점수.get(i) >= average) {

                평균이상.add(수학점수.get(i));

            }
        }
        System.out.println("평균이상 점수 = " + 평균이상);

        ArrayList<Integer> 오름차순 = new ArrayList<>(수학점수);

        Collections.sort(오름차순);


        System.out.println("오름차순으로 정렬된 리스트 = " + 오름차순);

        int 중앙값 = 0;
        int 갯수 = 오름차순.size();
        if (갯수 % 2 == 1) {
            중앙값 = 오름차순.get((갯수 / 2));
        } else {
            int 중앙값1 = ((갯수 / 2) - 1);
            int 중앙값2 = (갯수 / 2);
            중앙값 = ((오름차순.get(중앙값1) + 오름차순.get(중앙값2)) / 2);

        }
        System.out.println("중앙값 = " + 중앙값);
    }

    @Test
    void listWithFunctionTest() {

        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
        assertThat(getSum(List.of(7))).isEqualTo(7);
        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return

        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return


    }

    int getSum(List<Integer> numbers) {

        int getSum = 0;

        for (int i = 0; i < numbers.size(); i++) {

            getSum += numbers.get(i);
        }
        System.out.println(getSum);

        return getSum;

    }

    double getAverage(List<Integer> numbers) {
//        double getSum = 0 ;
        double getAverage = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//
//            getSum += numbers.get(i);
//
//        }
        int sum = getSum(numbers);
        getAverage = (double) sum / numbers.size();
        if (numbers.isEmpty()) {
            getAverage = 0;
        }
        return getAverage;
    }

    @Test
    void findMaxTest() {

        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
        assertThat(findMax(List.of(7))).isEqualTo(7);

    }

    int findMax(List<Integer> numbers) {

        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    int findMin(List<Integer> numbers) {

        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    @Test
    void isPassTest() {
        assertThat(isPass(List.of(60, 60))).isTrue();
        assertThat(isPass(List.of(40, 80))).isTrue();
        assertThat(isPass(List.of(39, 100, 100))).isFalse();
        assertThat(isPass(List.of(100, 0, 100))).isFalse();
    }

    boolean isPass(List<Integer> scores) {
        for (int score : scores) {
            if (score < 40) {
                return false;
            }
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = total / (double) scores.size();

        return average >= 60;
    }

    @Test
    void getIntegerBetweenTest() {

        assertThat(getIntegersBetween(1, 5)).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(getIntegersBetween(-3, 1)).isEqualTo(List.of(-3, -2, -1, 0, 1));
        assertThat(getIntegersBetween(3, 3)).isEqualTo(List.of(3));
        assertThat(getIntegersBetween(5, 1)).containsExactlyInAnyOrder(5, 4, 3, 2, 1);
    }

    public static List<Integer> getIntegersBetween(int a, int b) {
        List<Integer> result = new ArrayList<>();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                result.add(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                result.add(i);
            }
        }

        return result;
    }

    @Test
    void filterPositiveTest() {

        assertThat(filterPositive(List.of(-1, 2, -3, 4, 0))).isEqualTo(List.of(2, 4));
        assertThat(filterPositive(List.of(-1, -2, -3))).isEqualTo(List.of());
        assertThat(filterPositive(List.of())).isEqualTo(List.of());

    }

    List<Integer> filterPositive(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());

    }

    @Test
    void findPassedStudentsTest() {

        assertThat(findPassedStudents(List.of(70, 85, 90, 75, 80))).isEqualTo(List.of(85, 90, 80));
        assertThat(findPassedStudents(List.of(70, 75, 79))).isEqualTo(List.of());
        assertThat(findPassedStudents(List.of(80, 85, 90))).isEqualTo(List.of(80, 85, 90));

    }
    List<Integer> findPassedStudents(List<Integer> grades) {
        return grades.stream()
                .filter(grade -> grade >= 80)
                .collect(Collectors.toList());
    }

    @Test
    void removeDuplicatesTest() {

        assertThat(removeDuplicates(List.of(1, 2, 2, 3, 4, 4, 5))).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(removeDuplicates(List.of(1, 1, 1, 1))).isEqualTo(List.of(1));
        assertThat(removeDuplicates(List.of())).isEqualTo(List.of());
    }
    List<Integer> removeDuplicates(List<Integer> inputList) {
        // HashSet을 사용하여 중복을 제거
        Set<Integer> uniqueSet = new HashSet<>(inputList);
        // 중복이 제거된 Set을 ArrayList로 변환
        return new ArrayList<>(uniqueSet);
    }

    @Test
    void calculateRanksTest() {

        assertThat(calculateRanks(List.of(80, 90, 70, 85))).isEqualTo(List.of(3, 1, 4, 2));
        assertThat(calculateRanks(List.of(100, 100, 80))).isEqualTo(List.of(1, 1, 3));
        assertThat(calculateRanks(List.of())).isEqualTo(List.of());
    }

    List<Integer> calculateRanks(List<Integer> scores) {
        List<Integer> ranks = new ArrayList<>();

        for (int i = 0; i < scores.size(); i++) {
            int rank = 1; // 순위는 1부터 시작합니다.
            for (int j = 0; j < scores.size(); j++) {
                if (scores.get(j) > scores.get(i)) {
                    rank++;
                }
            }
            ranks.add(rank);
        }
        return ranks;

}

    @Test
    void calculateTotalPriceTest() {

        assertThat(calculateTotalPrice(List.of(1000, 2000, 3000))).isEqualTo(6000);
        assertThat(calculateTotalPrice(List.of(5000))).isEqualTo(5000);
        assertThat(calculateTotalPrice(List.of())).isEqualTo(0);

    }
    int calculateTotalPrice(List<Integer> prices) {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }

    @Test
    void applyDiscountTest() {

        assertThat(applyDiscount(List.of(1000, 2000, 3000), 10)).isEqualTo(List.of(900, 1800, 2700));
        assertThat(applyDiscount(List.of(5000), 50)).isEqualTo(List.of(2500));
        assertThat(applyDiscount(List.of(), 20)).isEqualTo(List.of());
    }
    List<Integer> applyDiscount(List<Integer> prices, int discountRate) {
        List<Integer> discountedPrices = new ArrayList<>();

        for (int price : prices) {
            double discountedPrice = price * (100 - discountRate) / 100.0;
            int roundedPrice = (int) Math.round(discountedPrice);
            discountedPrices.add(roundedPrice);
        }

        return discountedPrices;
    }

    @Test
    void filterExpensiveItemsTest() {

        assertThat(filterExpensiveItems(List.of(1000, 2000, 3000, 4000), 2500)).isEqualTo(List.of(3000, 4000));
        assertThat(filterExpensiveItems(List.of(1000, 1500, 2000), 3000)).isEqualTo(List.of());
        assertThat(filterExpensiveItems(List.of(), 2000)).isEqualTo(List.of());
    }

    List<Integer> filterExpensiveItems(List<Integer> prices, int threshold) {
        List<Integer> expensiveItems = new ArrayList<>();

        for (int price : prices) {
            if (price >= threshold) {
                expensiveItems.add(price);
            }
        }

        return expensiveItems;
    }





















