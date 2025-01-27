package lesson8.homework.weather_data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public
class DayShort {
    private float temp;
    private String condition;
    @JsonProperty(value = "feels_like")
    private float feelsLike;

    public float getFeelsLike() {
        return feelsLike;
    }

    public float getTemp() {
        return temp;
    }

    public String getCondition() {
        return condition;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setFeelsLike(float feelsLike) {
        this.feelsLike = feelsLike;
    }
}
