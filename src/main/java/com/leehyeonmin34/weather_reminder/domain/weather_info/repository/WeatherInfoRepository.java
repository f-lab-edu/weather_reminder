package com.leehyeonmin34.weather_reminder.domain.weather_info.repository;

import com.leehyeonmin34.weather_reminder.domain.weather_info.domain.WeatherInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherInfoRepository extends JpaRepository<WeatherInfo, Long> {
}
