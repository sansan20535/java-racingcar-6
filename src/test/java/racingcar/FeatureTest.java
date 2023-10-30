package racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class FeatureTest {
    @Test
    void split_CarName() {
        String input = "A,B";
        String[] result = input.split(",");

        assertThat(result).contains("B", "A");
        assertThat(result).containsExactly("A", "B");
    }

    @Test
    void insertionNameAndReset(){
        ArrayList<Car> carList = new ArrayList<Car>();
        String input = "car1,car2,car3";
        String [] carNameList = input.split(",");

        int i;
        for(i = 0; i < carNameList.length; i++){
            carList.add(new Car(carNameList[i], ""));
        }

        assertThat(carList.get(0).getName()).isEqualTo("car1");
        assertThat(carList.get(1).getName()).isEqualTo("car2");
        assertThat(carList.get(2).getName()).isEqualTo("car3");

        assertThat(carList.get(0).getDistance()).isEqualTo("");
        assertThat(carList.get(1).getDistance()).isEqualTo("");
        assertThat(carList.get(2).getDistance()).isEqualTo("");
    }
}
