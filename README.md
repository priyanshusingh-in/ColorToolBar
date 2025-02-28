# ColorToolBar

A simple Android application that demonstrates how to create a toolbar that changes color based on tab selection.

## Overview

ColorToolBar is a minimalist Android app that showcases dynamic UI color changes using the Material Design TabLayout. The app features a toolbar that changes its color when the user switches between tabs.

## Features

- Toolbar color changes dynamically based on tab selection
- Three tabs with different colors (Red, Black, Green)
- Simple and clean UI
- Minimal code implementation

## Screenshots

![App Preview](screenshots/preview.png)

## Technical Implementation

The app demonstrates:
- How to implement TabLayout with Material Components
- Dynamic toolbar color changes
- Event handling with TabLayout.OnTabSelectedListener
- Simple UI state management

## Requirements

- Android Studio Arctic Fox (2020.3.1) or higher
- Minimum SDK: 26 (Android 8.0 Oreo)
- Target SDK: 34 (Android 14.0)
- Kotlin version: 1.9.0 or higher

## Dependencies

- androidx.core:core-ktx:1.12.0
- androidx.appcompat:appcompat:1.6.1
- com.google.android.material:material:1.10.0

## Setup Instructions

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/ColorToolBar.git
   ```

2. Open the project in Android Studio

3. Build and run the application on an emulator or physical device

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/singhsde/colortoolbar/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── colors.xml
│   │   │   │   ├── strings.xml
│   │   │   │   └── themes.xml
│   │   │   └── mipmap/
│   │   │       └── ic_launcher.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
└── build.gradle.kts
```

## How to Use

1. Launch the app
2. The toolbar will initially be red (default selected tab)
3. Tap on any tab to change the toolbar color:
   - Red tab: Changes toolbar to red
   - Black tab: Changes toolbar to black
   - Green tab: Changes toolbar to green

## Troubleshooting

### Common Issues

1. **Build Error with Adaptive Icons**:
   ```
   ERROR: <adaptive-icon> elements require a sdk version of at least 26.
   ```
   **Solution**: Make sure your `minSdk` is set to 26 or higher in your app's `build.gradle.kts` file:
   ```kotlin
   android {
       defaultConfig {
           minSdk = 26
           // other config...
       }
   }
   ```

2. **Layout Not Showing Properly**:
   - Ensure you have the latest Material Components dependency
   - Check that the theme is set correctly in your manifest
   - Make sure all layout components have proper constraints/dimensions

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For questions or feedback, please contact:
- Email: your.email@example.com
- GitHub: [Your GitHub Username](https://github.com/yourusername)
