import { useState } from "react";

function Weather() {

    const [city, setCity] = useState("");
    const [weather, setWeather] = useState(null);

    const searchWeather = async () => {

        // First find latitude and longitude of the city
        const locationResponse = await fetch(
            `https://geocoding-api.open-meteo.com/v1/search?name=${city}&count=1`
        );

        const locationData = await locationResponse.json();

        const latitude = locationData.results[0].latitude;
        const longitude = locationData.results[0].longitude;

        // Now get weather using those coordinates
        const weatherResponse = await fetch(
            `https://api.open-meteo.com/v1/forecast?latitude=${latitude}&longitude=${longitude}&current=temperature_2m,relative_humidity_2m,wind_speed_10m`
        );

        const weatherData = await weatherResponse.json();

        setWeather(weatherData.current);
    };

    return (
        <div>

            <h1>Weather App</h1>

            <input
                type="text"
                placeholder="Enter city"
                value={city}
                onChange={(e) => setCity(e.target.value)}
            />

            <button onClick={searchWeather}>
                Search
            </button>

            {weather && (
                <div>

                    <h2>Weather Information</h2>

                    <p>
                        Temperature: {weather.temperature_2m}°C
                    </p>

                    <p>
                        Humidity: {weather.relative_humidity_2m}%
                    </p>

                    <p>
                        Wind Speed: {weather.wind_speed_10m} km/h
                    </p>

                </div>
            )}

        </div>
    );
}

export default Weather;