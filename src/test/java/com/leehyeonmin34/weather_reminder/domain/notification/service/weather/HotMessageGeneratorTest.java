package com.leehyeonmin34.weather_reminder.domain.notification.service.weather;

import com.leehyeonmin34.weather_reminder.domain.user.domain.User;
import com.leehyeonmin34.weather_reminder.domain.user.domain.UserBuilder;
import com.leehyeonmin34.weather_reminder.domain.weather_info.builder.WeatherInfoBuilder;
import com.leehyeonmin34.weather_reminder.domain.weather_info.domain.WeatherInfo;
import com.leehyeonmin34.weather_reminder.global.parent.ServiceTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.BDDAssertions.then;

public class HotMessageGeneratorTest extends ServiceTest {

    @InjectMocks
    private HotMessageGenerator hotMessageGenerator;

    @Test
    public void generateTest(){

        // GIVEN
        WeatherInfo weatherInfo = WeatherInfoBuilder.build();
        User user = UserBuilder.build();

        // WHEN
        String result = hotMessageGenerator.generate(user, weatherInfo);

        // THEN
        then(result).isEqualTo("더운 날 메시지");

    }
}
