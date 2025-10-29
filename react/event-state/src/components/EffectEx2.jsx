import { useEffect, useRef, useState } from 'react';

export default () => {
  const [weather, setWeather] = useState(null);
  const city = useRef(null);
  const API_KEY = 'APIKEY';

  const callWeather = async () => {
    if (!city.current.value) return;

    const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city.current.value}&appid=${API_KEY}&lang=kr&units=metric`);
    const data = await response.json();
    setWeather(data);
  };

  useEffect(() => {
    const url = `https://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=${API_KEY}&lang=kr&units=metric`;
    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        setWeather(data);
      });
  }, []);
  return (
    <div>
      <input type="text" ref={city} placeholder="도시명 입력" />
      <button onClick={callWeather}>날씨조회</button>
      {weather && (
        <div>
          <p>도시명 : {weather.name}</p>
          <p>현재 날씨 : {weather.weather[0].description}</p>
          <p>온도 : {weather.main.temp}℃</p>
        </div>
      )}
      {!weather && <p>날씨정보를 불러오는 중입니다....</p>}
    </div>
  );
};
