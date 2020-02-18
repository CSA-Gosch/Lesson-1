#Lesson 1.1.2
<p>#5: Both SecondClass and Song have print lines</p>
<p>#7: Float, Int, Double, String, and Char</p>
<p>#17: Welcome to your media library. Song@75412c2f</p>
<p>Conclusion 1: The advantages of using getters and setters makes it easier to 
change values of objects, but a disadvantage is how the class may look cumbersome</p>
<p>Conclusion 2: Univeral objects and classes could reduce the size of rating and price taken up in both classes</p>

<br>

#Lesson 1.1.3
<p>#8: The mutator might look like setFavorite() and I prefer the new nethod for method because
It's shorter.</p>
<p>#12: camelCasing is a basic method to make code easier to read, like pseudocode</p>
<p>Conclusion 1: More than one constructor allows for more flexibility in the input of parameters.</p>
    
        public Song(String t, double p, int r){
            this.title = t;
            this.price = p;
        }

<br>

#Lesson 1.1.4
<p>#1:</p>
<p>    a. A string is defined as a 'String [yourString]' then it's a object, 
and other wise, either with a constructor or method, it's primitive.</p>
<p>    b. Null is a placeholder for an empty value.</p>
<p>    c. Either with an object or a system out print.</p>
<p>    d. A super or parent class builds and provides parameters for the scope of a child class.</p>
<p>    e. WeatherConditions is the parent class for our current String.</p>
<p>    f. Instance of will tell us where the method is calling.</p>
<p>#10: result1 is using the == operand which doesn't work for strings while the .equals used in result2</p>
<p>#25: The || operand will always short circuit if the first value is true and the && operand 
    will as well if the first value is false</p>
<p>#27: if (!sunny && !clear)</p>
<p>     if (!(!raining || !snowing))</p>
<p>#28:     if (!(temperature <= 75))</p>
<p>         if (!(temperature > 100))</p>
<p>         if (!(temperature != 32))</p>