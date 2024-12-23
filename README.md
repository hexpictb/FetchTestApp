# FetchTestApp

## Overview
This is a test project for an Android Developer position. The application performs following https://fetch-hiring.s3.amazonaws.com/hiring.json. While this is not a production-ready solution, the code is structured to reflect best practices and maintainability.


## Technologies Used
- **Programming Language:** Kotlin
- **Architecture:** MVVM (Model-View-ViewModel)
- **Dependency Injection:** Hilt
- **Networking :** Retrofit
- **Build Tool:** Gradle

---

## Setup and Installation
### Prerequisites
- Android Studio Dolphin or later
- Minimum Android SDK version: 24
- Target Android SDK version: 34
- Java Development Kit (JDK) 11+

### Steps to Run the Project
1. Clone the repository:
   ```bash
   git clone git@github.com:hexpictb/FetchTestApp.git
   ```
2. Open the project in Android Studio.
3. Sync the Gradle files.
4. Build and run the app on an emulator or physical device.


## Project Structure
```
app/
├── data/           # Data layer (repositories, DAOs, and API service)
├── di/             # Dependency Injection modules
├── domain/         # Business logic (use cases and models)
└── ui/             # Presentation layer (activities, fragments, view models)
```

## License
This project is licensed under the MIT License - see the LICENSE file for details.

---

## Contact
If you have any questions or feedback, please contact me at aleksander.ezhkov@gmail.com.

