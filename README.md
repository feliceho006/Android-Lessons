# Android-Lessons

### Android Lesson 1: Random Images
Learning outcomes:
- Modify the xml layout file to specify LinearLayout, TextView and Button widgets, their id attribute and layout attributes 
- Describe nested classes and anonymous classes in java 
- use the instance method findViewById() 
- Describe the R class in android 
- Explain what is meant by inflating the layout 
- Write java code in onCreate() 
- Write java code to modify the text attribute of a widget 
- Write java code to implement a callback

The strategy with this app: 
- Store all images in the res/drawables folder. Put the Image IDs in an ArrayList 
- When the Button is clicked, retrieve the image ID from the ArrayList in sequence. 
- Use the image ID to retrieve the image and place it in the ImageView widget.

### Android Lesson 2: Exchange Rate App
Learning outcomes:
- Describe the static factory method and builder design pattern in Java 
- Use the BigDecimal class for financial calculations 
- From an EditText widget, extract data and specify input settings 
- Use the logcat to display messages to track the behaviour of an app 
- Describe what a Toast is and write code to display toasts 
- Explain what is an Explicit Intent and write code to implement it 
- Explain what is an Implicit Intent and write code to implement it 
- Modify the android manifest to change the app name and to specify a parent activity 
- Describe the Android activity life cycle 
- Describe and modify the code needed for an Options Menu 
- Save app data using the SharedPreferences class 
- Explain the purpose of Unit Testing and write code for unit tests using the JUnit framework

The strategy with this app:
- Part 1:
  - You will write code so that the exchange rate will be calculated using the default exchange rate of 2.95. 
    - The user will enter the value in the EditText widget. 
    - The code will retrieve the user input, perform the conversion and display the result. 
    - If the user input is blank and the button is clicked, then you would display a toast and a logcat message
- Part 2:
  - You will write code to allow the user to enter the exchange rate information in a different activity called SubActivity.
    - Specify that your app has more than one activity in the Android manifest 
    - Bring the user from MainActivity to SubActivity using an Explicit Intent 
    - When the user keys in the exchange rate, write code to handle bad or unintended inputs. My suggested implementation is to use Exceptions to recall this Java concept. 
    - Bring the user from SubActivity back to MainActivity and pass the data back

### Android Lesson 3: Comic App
Learning outcomes:
- Describe how the AsyncTasks class is used
- Query an API using the AsyncTasks class
- State the limitations of the AsyncTasks class
- Modify the android Manifest to set permissions and fix the orientation
- Download JSON data given a URL of an API call
- Parse JSON data using the JSONObject class
- Download an Image file given a URL
- Display the information in the UI

The strategy with this app:
- Make GetComic extend AsyncTask<String, String, Bitmap> (note the different types and ask yourself why … )
- (doInBackground) Call Utils.getImageURLFromXkcdApi to get the image URL from comicNo
- (onProgressUpdate, doInBackground) Call publishProgress, write code to update textViewTitle with the image URL
- (doInBackground)Call Utils.getBitmap using the URL to get the bitmap
- (onPostExecute)Assign the Bitmap downloaded to imageView. The bitmap may be null.

### Android Lesson 4: Pokédex
Learning outcomes:
- Calling intents using startActivityForResult() in an android app
- Implement a RecyclerView in an Android app
- Describe the use of static nested classes
- Describe Delegation and the Strategy Design Pattern
- Describe the Adapter Design Pattern

The strategy with this app:
- Recyclerview
  - Instantiate CharaAdapter
  - Assign the CharaAdapter instance to the RecyclerView widget
  - Assign a LayoutManager instance to the RecyclerView widget. You can choose between LinearLayoutManager() and GridLayoutManager()
