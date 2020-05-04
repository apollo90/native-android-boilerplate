# **Android Project Boilerplate**

# **IDE**


# **Stack**
- **Retrofit** - Network request manager by Airbnb
- **Room** - Google persistence library


# **Framework**


# **Persistence (Storage)**

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


## Project Structure
This is the desired project structure for our android app


    ├── Activity                
    ├── Adapter                    
    ├── Fragment                                       
    ├── HttpRequest                   
    ├── Model    
    ├── Wrapper                   
    └── Util



**Activity:** Contains yout project Activity classes. An Activity name example can be LoginActivity.

**Fragment**: Contains your project Fragment classes. A Fragment name example can be UserRegisterFragment

**Adapter**: Contains Adapter classes for your ListViews (or RecyclerViews). Adapters should be reused as much as possible to prevent repeating code. (DRY :) ) An Adapter name example can be SongsAdapter.

**HttpRequest**: This depends on your preference I personally name this package as HttpRequest and contains the classes associated with Retrofit2 to perform REST calls, as well as the API interface where I define the endpoints. Class names can vary, in my case, I usually have the RetrofitServer.java, MyAppAPI.java and APIUtils.java classes.

**Model**: The Model package is usually used to store the classes to map objects from a network request, or simply to create objects in other classes. Since it looks weird to initialize an object as 'HouseModel house = new HouseModel()' I take out the component name from it and keep it just as House.

**Wrapper**: This package contains classes that serve as wrappers when performing network calls, and usually contains only one object pointing to a Model class. Same as with Adapters, try to reuse as much of these as you can. I usually name this classes with the same name as the Model class it'll wrapp, but with 'Response' at the end, for example, HouseResponse.

**Util**: Any other classes that you cosnider that don't require their own package, from simple things as a class that creates some special margin you wanted for your TextViews to Services or Singleton classes to manage user sessions.



## Naming Conventions

There are actually no official documents released about naming conventions in Android projects. So, some of you might think that there is no need to have naming conventions in our Android projects. Trust me, it does not harm you in any way to adopt good and consistent naming across your Android project. Instead, it will give you several benefits:
Meaningful filenames allow you to have a good idea on what is roughly inside the file, just by looking at the file name. This is especially helpful in bigger projects as you will often navigate within the project to find some files.
Better organisation of the project as similar files are grouped together because of their names.
No more confusion about names of resources or components if there are similar names in the same project
Convenient way of giving a name to a new resource file or source file as you just need to follow the naming convention.
Below are some guidelines on good naming conventions and guidelines:

## Strings.xml
Consider prefixing with layout name or sections, so that we know which sections it belong to
Use namespaces. Eg. global_ or error_, etc.
Write string values in normal conventions (do not capitalize all characters).

## Colors.xml & dimens.xml
Treat colors.xml as palette of colors. Instead of defining color per elements, define a few color theme to be used in the application.
Similarly, for dimens.xml, treat it as palette of typical spacings and sizes in the application instead of individual values of paddings and margins of each component
Layout Files
The naming of layout resource files can be prefixed according to the table below, as it would help to categorize layout for similar components together, which leads to neater organisation.

## Layout files
Resource IDs
Although Android allows same IDs for different view elements in different layouts within the same project, it is advisable not to do so. One way of naming the element component inside the layout is to use their short form, eg. btn for Button, txt for TextView. Layout name can also be prepended to these ids.

## Resource IDs
Drawable Files
Drawable files can be prefixed according to its asset type. It is summarised below:

Naming convention for Drawable files
These naming conventions are guidelines that can help developers when building their Android application. Of course, you may not need to follow these guidelines 100% in your projects. In fact, you are also free to adjust these guidelines to your liking, or even use your own naming conventions in your projects. However, more importantly is that, once you have decided on the naming convention for a project, you should stick to it for the rest of that particular project, so as to avoid inconsistencies in naming that may cause confusion.
# Contributors

# License

