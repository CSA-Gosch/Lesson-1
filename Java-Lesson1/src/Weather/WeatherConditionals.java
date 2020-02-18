package Weather;

public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        boolean sunny = false;
        boolean snow = false;
        String result = "";
        if(description.indexOf("windy") <= 0 && temperature == 32){
            windy = true;
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        if(description.indexOf("sunny") <= 0 && temperature == 34){
            sunny = true;
            return "It’s safe to go outside, 34 degrees and sunny.";
        }
        if(description.indexOf("snow") <= 0 && temperature == 33){
            snow = true;
            return "It’s safe to go outside, 33 degrees and snow";
        }
        if(description.indexOf("snow") <= 0 && temperature == 30){
            snow = true;
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        if(description.indexOf("windy") <= 0 && temperature == 30){
            windy = true;
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }

        return result;


    }
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description)
    {
        String result = "";

        if(description.indexOf("windy") <= 0 && temperature < 32){
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
       else if(description.indexOf("sunny") <= 0 && temperature  == 55){
            return "It’s safe to go outside, but just a tad chilly.";
        }
        else if(description.indexOf("snow") <= 0 && temperature == 33){
            return "Pack some snow boots, and watch out";
        }
        else if(description.indexOf("snow") <= 0 && temperature == 30){
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        else if(description.indexOf("windy") <= 0 && temperature == 30){
            return "Too windy or cold! Enjoy watching the weather through the window.";

        }
        return result;


    }

}
