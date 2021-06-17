# **Android Project Boilerplate**
This is a description of your android app project with a summary link to important web resources.

# **IDE**
Android Studio is the IDE of choice available at [link]

# **Stack**
- [Retrofit](https://nodejs.org) - Network request manager by Square
- [Room Library](https://nodejs.org) - Google persistence library


# **Framework & Illustrations**
The following are illustrations explaining various system architectures.

### **Room Persistence Diagram:**

HERE IS DIAGRAM




# **Persistence (Storage)**
The tradionational SQLite implementation has been swapped out for the Room library by Google. Read more [link to room ]here


# **Testing**

# **Deployment**

# **Launch Checklist**

**Google Checklist**
-> https://developer.android.com/distribute/best-practices/launch/launch-checklist for more details and ensure that the app follows these guidelines.

**Project Costing**
-> https://engineerbabu.com/blog/mobile-app-development-cost/



# **Guidelines**

## Packages
The correct way to name your project is **com.company.appname**


## **Project Structure**
This is the desired project structure for our android app


    ├── Activity                
    ├── Adapter                    
    ├── Fragment                                       
    ├── HttpRequest                   
    ├── Model    
    ├── Wrapper                   
    └── Util

## Structure and Naming Convention Explained

**Activity:** Contains yout project Activity classes. An Activity name example can be LoginActivity.

**Fragment**: Contains your project Fragment classes. A Fragment name example can be UserRegisterFragment

**Adapter**: Contains Adapter classes for your ListViews (or RecyclerViews). Adapters should be reused as much as possible to prevent repeating code. (DRY :) ) An Adapter name example can be SongsAdapter.

**HttpRequest**: This depends on your preference I personally name this package as HttpRequest and contains the classes associated with Retrofit2 to perform REST calls, as well as the API interface where I define the endpoints. Class names can vary, in my case, I usually have the RetrofitServer.java, MyAppAPI.java and APIUtils.java classes.

**Model**: The Model package is usually used to store the classes to map objects from a network request, or simply to create objects in other classes. Since it looks weird to initialize an object as 'HouseModel house = new HouseModel()' I take out the component name from it and keep it just as House.

**Wrapper**: This package contains classes that serve as wrappers when performing network calls, and usually contains only one object pointing to a Model class. Same as with Adapters, try to reuse as much of these as you can. I usually name this classes with the same name as the Model class it'll wrapp, but with 'Response' at the end, for example, HouseResponse.

**Util**: Any other classes that you cosnider that don't require their own package, from simple things as a class that creates some special margin you wanted for your TextViews to Services or Singleton classes to manage user sessions.



## Resources Naming Convention



**Strings.xml**:  Consider prefixing with layout name or sections, so that we know which sections it belong to. Use namespaces. Eg. global_ or error_, etc.. Write string values in normal conventions (do not capitalize all characters).


**Resource IDs**: Android allows same IDs for different view elements, Use their short form, eg. btn for Button, txt for TextView. Layout name can also be prepended to these ids.

**Drawable Files**: follow the naming guidelines from android i.e ic_name for images


**NOTE:**

Conventions are guidelines that can help developers when building their Android application. Of course, you may not need to follow these guidelines 100% in your projects. In fact, you are also free to adjust these guidelines to your liking, or even use your own naming conventions in your projects. However, more importantly is that, once you have decided on the naming convention for a project, you should stick to it for the rest of that particular project, so as to avoid inconsistencies in naming that may cause confusion.


# **Contributors**
Charles Mutale
