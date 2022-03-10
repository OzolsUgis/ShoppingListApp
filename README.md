<h1 align="center">ShoppingList App</h1>
<p align="center">Follow through your shopping cart</p>

![product-screenshot](https://live.staticflickr.com/65535/51930111395_0877e67a9d_b.jpg)

<details open ="open">
  <summary>Contains</summary>
  <ol>
    <li>
      <a href='#about-the-project'>About Project</a>
        <ul>
          <li><a href="#built-with">Built With</a></li>
        </ul>
    </li>
    <li>
      <a href='#getting-started'>Getting Started</a>
        <ul>
          <li><a href="#prerequisites">Prerequisites</a></li>
        </ul> 
        <ul>
          <li><a href="#installation">Installation</a></li>
        </ul>
    </li> 
    <li>
      <a href='#usage'>Usage</a>
         <ul>
          <li><a href="#run-application">Run Application</a></li>
        </ul> 
       <ul>
          <li><a href="#run-tests">Run Tests</a></li>
        </ul> 
    </li>
    <li>
      <a href='#architecture'>Architecure</a>
         <ul>
          <li><a href="#data">Data</a></li>
        </ul> 
       <ul>
          <li><a href="#domain">Domain</a></li>
        </ul> 
          <ul>
          <li><a href="#presentation">Presentation</a></li>
        </ul> 
    </li>
    <li>
      <a href='#additional-information'>Additional information</a>
    </li>
    <li>
      <a href='#contacts'>Contacts</a> 
    </li>
  </ol>
</details>

## About Project

Shopping list application general purpose is to help guide you through everyday shopping. This shopping list app allows you to chose categories for your products, to keep 
your list organised.

Application is built to cover all functions that you need for this kind of tracking : 
* Adding your name 
* Observing list changes 
* Adding new products to list sorted by categories
* Checking product when product is in shopping cart
* Deleting checked product after its bought
* Sharing this app with your friends allows you to make common shopping lists 

### Built With 

This application is built in  [Android Studio version 2021.1.1 (Bumblebee)](https://developer.android.com/studio?gclid=CjwKCAjwgb6IBhAREiwAgMYKRlU8WsxaTu6kg3JANeH6rEr8MrWyit5JaDfcTy0v1tTP0-DOmL1QnRoCxrcQAvD_BwE&gclsrc=aw.ds) 
using :

* [Kotlin](https://developer.android.com/kotlin)
* [Jetpack Compose version 1.1.0](https://developer.android.com/jetpack/compose?gclid=EAIaIQobChMImIyxhI-i8gIVlgCiAx3kZgYlEAAYASAAEgL1J_D_BwE&gclsrc=aw.ds)
* [Cloud Firestore](https://firebase.google.com/docs/firestore/)
* [Courotines](https://developer.android.com/kotlin/coroutines?gclid=EAIaIQobChMIqZC4jo-i8gIVsAZ7Ch1rOASzEAAYASAAEgKAwvD_BwE&gclsrc=aw.ds)
* [DaggerHilt](https://developer.android.com/training/dependency-injection/hilt-android)
* [Mockk](https://mockk.io/)
* [Truth](https://truth.dev/)
* [JUnit4](https://github.com/junit-team/junit4/wiki)
* [Dokka](https://github.com/Kotlin/dokka)
* [Kdoc](https://kotlinlang.org/docs/kotlin-doc.html)

<p align="right" dir="auto">(<a href="#top">back to top</a>)</p>

## Getting Started
### Prerequisites 

First of all you need to install Android Studio version 2021.1.1 (Bumblebee) or any version who supports Jetpack compose
you can find installation step-by-step in following : 

* [Android Studio version 2021.1.1 (Bumblebee)](https://developer.android.com/studio?gclid=CjwKCAjwgb6IBhAREiwAgMYKRlU8WsxaTu6kg3JANeH6rEr8MrWyit5JaDfcTy0v1tTP0-DOmL1QnRoCxrcQAvD_BwE&gclsrc=aw.ds) 

### Installation 

1. Clone the repository using : 

  * Android studio **file -> New -> Project from version control...** And enter this https://github.com/OzolsUgis/ShoppingListApp.git in URL

  * Using terminal 
  ```sh
   git clone https://github.com/OzolsUgis/ShoppingListApp.git
   ```
   
2. **Sync** project if it's needed and project is ready to use 



<p align="right" dir="auto">(<a href="#top">back to top</a>)</p>

## Usage

* In this section is shown how to run application and how to run tests built for this app.

### Run Application

After project is cloned (If not please clone the project, you can find how to do it in <a href="#installation">Installation</a> section

You can run application in <b>Run/Debug</b> section in your toolbar. By pressing <b>Play icon</b> 

![product-screenshot](https://live.staticflickr.com/65535/51929651713_80ab1af532_w.jpg)

### Run Tests

This application contains 2 types of tests: 

* Instrumented UI test
* Unit Tests

<b><h3>!!! Important</h3></b>
* If any errors occurr while testing instrumented test try to run them separately

<b><h3>To launch Unit test you need to locate to tests directory.</h3></b>


   <b>App -> java -> com(test)</b>
   
   after location to this state use left click on <b>shoppinglistapp</b> and <b>Run'Tests in 'com.ugisozols.shoppinglistapp'</b>
  

![product-screenshot](https://live.staticflickr.com/65535/51930197985_2a1c0f315d_w.jpg)


<b><h3>To launch instrmented tests, locate to androidtest directory</h3></b>

   ```Instrumented tests are in "androidTest" package, they require specific android functionality```


   <b>App -> java -> com(androidTest)</b>


   after location to this state use right click on <b>shoppinglistapp</b> and <b>Run'Tests in 'com.ugisozols.shoppinglistapp'</b>
   
   ![product-screenshot](https://live.staticflickr.com/65535/51929945504_0ffd678291_w.jpg)


<p align="right" dir="auto">(<a href="#top">back to top</a>)</p>


## Architecture

  For arcthitecture i used layer pattern, i decided to not make one feature and put these layers in there, It would be unnecessary for 
  project this size 
  
  Architecture contains 3 main layers : 
  * <a href="#data">Data</a>
  * <a href="#domain">Domain</a>
  * <a href="#presentation">Presentation</a>

  This type of architecture is uset to provide separation of concepts.
  
  * Presentation layer only have access to Domain layer, but can't access Data layer directly
  * Data layer only accesses Domain layer, can't directly access to Presentation layer
  * Domain layer cant access any layers

  This structure and usage of interfaces makes application scalable and easy testable. 

  
  ### Data
  
  Contains:
   * Data class what specifies how data looks in database.
   * Implemntation of Preferences interface
   * Mapper functions to Map database data to data that is visible in UI, and other way around
   * Implementation of Repository interface

  ### Domain 
  
  Contains:
   * Models (data classes) how data looks in the UI
   * Preferences interface (Implemented in Data package)
   * Repository interface (Implemented in Data package)
   * UseCases, contains buisness logic (Used in viewModels)
    
  ### Presentation 
  
  Contains: 
   * ShoppingList screen composition, components & ViewModel
   * Application UI Theme functions 
   * Welcome screen composition & ViewModel
   * MainActivity (contains navigation functionality)



<p align="right" dir="auto">(<a href="#top">back to top</a>)</p>

## Additional inforamtion

Application is built and tested on real device

Xiaomi 11 Lite 5G NE
 * Android version 11
 * 8 Gb RAM
 * Max 2.4GHz Octa-core

Application still contains some bugs because lack of experience and time pressure.
Development process went fluent until documentation and testing implementation, thats the field 
i don't have a lot experience. 

Thanks for your time rewieving this project.

## Contacts

Ugis Ozols - https://www.linkedin.com/in/ozols-ugis/

E-mail - ozols.ugis@outlook.com

Contact number  +371 25715943

WebPage - https://ozolsugis.com/

Project Link - https://github.com/OzolsUgis/ShoppingListApp.git



 
   
   


  
 










