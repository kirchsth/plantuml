# Directory Documentation for `stdlib`

## Builtin functions [%]

Some functions are defined by default. Their name starts by ``%``

| Name                     | Description                                                                                                                                         | Example                                                   | Return                                           |
| ------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------- | ------------------------------------------------ |
| ``%boolval``             | Convert a value _(String, Integer, JSON value)_ to boolean value                                                                                    | ``%boolval("true")``                                      | ``1``                                           |
| ``%call_user_func``      | Invoke a return function by its name with given arguments.                                                                                          | ``%call_user_func("bold", "Hello")``                      | Depends on the called function                   |
| ``%chr``                 | Return a character from a give Unicode value                                                                                                        | ``%chr(65)``                                              | ``A``                                            |
| ``%darken``              | Return a darken color of a given color with some ratio                                                                                              | ``%darken("red", 20)``                                    | ``#CC0000``                                      |
| ``%date``                | Retrieve current date. You can provide an optional [format for the date](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html) | ``%date("yyyy.MM.dd' at 'HH:mm")``                        | current date                                     |
|                          | You can provide another optional time ([on epoch format](https://en.wikipedia.org/wiki/Epoch%5F%28computing%29))                                    | ``%date("YYYY-MM-dd", %now() + 1*24*3600)``               | tomorrow date                                    |
| ``%dec2hex``             | Return the hexadecimal string (String) of a decimal value (Int)                                                                                     | ``%dec2hex(12)``                                          | ``c``                                            |
| ``%dirpath``             | Retrieve current dirpath                                                                                                                            | ``%dirpath()``                                            | current path                                     |
| ``%feature``             | Check if some feature is available in the current PlantUML running version                                                                          | ``%feature("theme")``                                     | ``true``                                         |
| ``%false``               | Return always ``false``                                                                                                                             | ``%false()``                                              | ``false``                                        |
| ``%file_exists``         | Check if a file exists on the local filesystem                                                                                                      | ``%file_exists("c:/foo/dummy.txt")``                      | ``true`` if the file exists                      |
| ``%filename``            | Retrieve current filename                                                                                                                           | ``%filename()``                                           | current filename                                 |
| ``%function_exists``     | Check if a function exists                                                                                                                          | ``%function_exists("$some_function")``                    | ``true`` if the function has been defined        |
| ``%get_all_theme``       | Retreive a JSON Array of all PlantUML [theme](https://plantuml.com/theme)                                                                                                | ``%get_all_theme()``                                      | ``["_none_", "amiga", ..., "vibrant"]``          |
| ``%get_all_stdlib``      | Retreive a JSON Array of all PlantUML [stdlib](https://plantuml.com/stdlib) names                                                                                        | ``%get_all_stdlib()``                                     | ``["archimate", "aws", ..., "tupadr3"]``         |
| ``%get_all_stdlib``      | Retreive a JSON Object of all PlantUML [stdlib](https://plantuml.com/stdlib) information                                                                                 | ``%get_all_stdlib(detailed)``                             | a JSON Object with stdlib information            |
| ``%get_variable_value``  | Retrieve some variable value                                                                                                                        | ``%get_variable_value("$my_variable")``                   | the value of the variable                        |
| ``%getenv``              | Retrieve environment variable value                                                                                                                 | ``%getenv("OS")``                                         | the value of ``OS`` variable                     |
| ``%hex2dec``             | Return the decimal value (Int) of a hexadecimal string (String)                                                                                     | ``%hex2dec("d")`` or ``%hex2dec(d)``                      | ``13``                                           |
| ``%hsl_color``           | Return the RGBa color from a HSL color ``%hsl_color(h, s, l)`` or ``%hsl_color(h, s, l, a)``                                                        | ``%hsl_color(120, 100, 50)``                              | ``#00FF00``                                      |
| ``%intval``              | Convert a String to Int                                                                                                                             | ``%intval("42")``                                         | ``42``                                           |
| ``%invoke_procedure``    | Dynamically invoke a procedure by its name, passing optional arguments to the called procedure.                                                     | ``%invoke_procedure("$go", "hello from Bob...")``         | Depends on the invoked procedure                 |
| ``%is_dark``             | Check if a color is a dark one                                                                                                                      | ``%is_dark("#000000")``                                   | ``true``                                         |
| ``%is_light``            | Check if a color is a light one                                                                                                                     | ``%is_light("#000000")``                                  | ``false``                                        |
| ``%lighten``             | Return a lighten color of a given color with some ratio                                                                                             | ``%lighten("red", 20)``                                   | ``#CC3333``                                      |
| ``%load_json``           | [Load JSON data from local file or external URL](https://github.com/plantuml/plantuml/pull/755)                                                     | ``%load_json("http://localhost:7778/management/health")`` | JSON data                                        |
| ``%lower``               | Return a lowercase string                                                                                                                           | ``%lower("Hello")``                                       | ``hello`` in that example                        |
| ``%mod``                 | Return the remainder of division of two integers (modulo division)                                                                                  | ``%mod(10, 3)``                                           | ``1``                                            |
| ``%newline``             | Return a newline                                                                                                                                    | ``%newline()``                                            | a newline                                        |
| ``%not``                 | Return the logical negation of an expression                                                                                                        | ``%not(2+2==4)``                                          | ``false`` in that example                        |
| ``%now``                 | Return the current epoch time                                                                                                                       | ``%now()``                                                | ``1685547132`` in that example (when updating the doc.) |
| ``%ord``                 | Return a Unicode value from a given character                                                                                                       | ``%ord("A")``                                             |  ``65``                                          |
| ``%lighten``             | Return a lighten color of a given color with some ratio                                                                                             | ``%lighten("red", 20)``                                   | ``#CC3333``                                      |
| ``%random()``            | Return randomly the integer `0` or `1`                                                                                                              | ``%random()``                                             | `0` or `1`                                       |
| ``%random(n)``           | Return randomly an interger between `0` and `n - 1`                                                                                                 | ``%random(5)``                                            | `3`                                              |
| ``%random(min, max)``    | Return randomly an interger between `min` and `max - 1`                                                                                             | ``%random(7, 15)``                                        | `13`                                             |
| ``%reverse_color``       | Reverse a color using RGB                                                                                                                           | ``%reverse_color("#FF7700")``                             | ``#0088FF``                                      |
| ``%reverse_hsluv_color`` | Reverse a color [using HSLuv](https://www.hsluv.org/)                                                                                               | ``%reverse_hsluv_color("#FF7700")``                       | ``#602800``                                      |
| ``%set_variable_value``  | Set a global variable                                                                                                                               | ``%set_variable_value("$my_variable", "some_value")``     | an empty string                                  |
| ``%size``                | Return the size of any string or JSON structure                                                                                                     | ``%size("foo")``                                          | ``3`` in the example                             |
| ``%splitstr``            | Split a string into an array based on a specified delimiter.                                                                                        | ``%splitstr("abc~def~ghi", "~")``                         | ``["abc", "def", "ghi"]``                        |
| ``%splitstr_regex``      | Split a string into an array based on a specified REGEX.                                                                                            | ``%splitstr_regex("AbcDefGhi", "(?=[A-Z])")``             | ``["Abc", "Def", "Ghi"]``                        |
| ``%string``              | Convert an expression to String                                                                                                                     | ``%string(1 + 2)``                                        | ``3`` in the example                             |
| ``%strlen``              | Calculate the length of a String                                                                                                                    | ``%strlen("foo")``                                        | ``3`` in the example                             |
| ``%strpos``              | Search a substring in a string                                                                                                                      | ``%strpos("abcdef", "ef")``                               | 4 (position of ``ef``)                           |
| ``%substr``              | Extract a substring. Takes 2 or 3 arguments                                                                                                         | ``%substr("abcdef", 3, 2)``                               | ``"de"`` in the example                          |
| ``%true``                | Return always ``true``                                                                                                                              | ``%true()``                                               | ``true``                                         |
| ``%upper``               | Return an uppercase string                                                                                                                          | ``%upper("Hello")``                                       | ``HELLO`` in that example                        |
| ``%variable_exists``     | Check if a variable exists                                                                                                                          | ``%variable_exists("$my_variable")``                      | ``true`` if the variable has been defined exists |
| ``%version``             | Return PlantUML current version                                                                                                                     | ``%version()``                                            | ``1.2020.8`` for example                         |


## Link of Current Preprocessing (documentation)
- [PlantUML Preprocessing](https://plantuml.com/preprocessing)
- [PlantUML Preprocessing JSON](https://plantuml.com/preprocessing-json)