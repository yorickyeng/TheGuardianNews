# News Aggregator

A modern Android news application that fetches and displays news from The Guardian RSS feed.

## Features

- Clean Architecture implementation
- Modern UI using Jetpack Compose
- Material 3 design system
- Responsive news list with beautiful cards
- WebView for reading full articles
- Pull-to-refresh functionality
- Error handling with user-friendly messages
- Category tags for news filtering
- Date formatting for better readability
- Author attribution
- Image support with Coil for efficient loading

## Technical Implementation

### Architecture
- Clean Architecture with separate domain, data, and presentation layers
- MVVM pattern for UI state management
- Dependency Injection using Hilt
- Coroutines and Flow for asynchronous operations
- Compose Navigation for screen navigation

### Libraries Used
- Jetpack Compose for UI
- Hilt for dependency injection
- Retrofit for network calls
- Coil for image loading
- XMLUtil for RSS parsing
- Material 3 for design components

### Design Decisions
1. **Card-based UI**: Implemented a card-based design for news items to provide clear visual separation and hierarchy
2. **Responsive Images**: Used Coil for efficient image loading with proper scaling and caching
3. **Category Tags**: Limited to 3 tags per news item to prevent UI clutter while maintaining information density
4. **Date Formatting**: Implemented custom date formatting for better readability
5. **Error Handling**: Comprehensive error handling with user-friendly messages
6. **WebView Implementation**: Full-featured WebView with JavaScript support and zoom capabilities

## Future Improvements
- Offline caching using Room
- Periodic news updates using WorkManager
- Search functionality
- Share feature
- Category-based filtering
- Sorting options
- Unit tests
- UI tests 