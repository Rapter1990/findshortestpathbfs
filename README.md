# Find the Shortest Path through Breadth First Search in Spring Boot  

<img src="" alt="Main Information" width="800" height="500">

### 📖 Information

<ul style="list-style-type:disc">
  <li>General Info</li>
  <li>General Info</li>
  <li>Here is the explanation of the project
      <ul>
        <li>Project Info</li>
        <li>https://mledoze.github.io/countries</li>
      </ul>
  </li>
</ul>

### Used Dependencies
* Core
    * Spring
        * Spring Boot
        * Spring Web
* Lombok
* Feign
* Docker

### 🔨 Run the App

<b>1 )</b> Download your project from this link shown below
```
    git clone https://github.com/Rapter1990/findshortestpathbfs
```

<b>2 )</b> Go to the project's home directory shown below
```
    cd findshortestpathbfs
```

<b>3 )</b> Create a jar file though this command shown below
```
    mvn clean install
```

<b>4 )</b> Run the project though this command shown below
```
    mvn spring-boot:run
```


Explore Rest APIs
<table style="width:100%">
  <tr>
    <th>Method</th>
    <th>Url</th>
    <th>Description</th>
    <th>Valid Request Body</th>
    <th>Valid Request Params</th>
    <th>Valid Request Params and Body</th>
    <th>No Request or Params</th>
  </tr>
  <tr>
      <td>GET</td>
      <td>route</td>
      <td>Find the shortest path</td>
      <td><a href="README.md#route">Info</a></td>
      <td></td>
      <td></td>
      <td></td>
  </tr>
</table>


## Valid Request Body

##### <a id="route">Find the shortest path
```
    http://localhost:8080/route
    
    {
       "from": the cca3 code of the country
       "to": the cca3 code of the country
    }
```


### Screenshots

<details>
<summary>Click here to show the screenshots of project</summary>
    <p> Figure 1 </p>
    <img src ="">
    <p> Figure 2 </p>
    <img src ="">
</details>    