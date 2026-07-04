# 📝 Todo List App

A simple and modern **Todo List Android application** built using **Kotlin**, **Jetpack Compose**, and the **MVVM Architecture**. The app allows users to create, view, and delete tasks with a clean Compose UI.

---

## ✨ Features

* ➕ Add new tasks
* 📋 View all tasks
* 🗑️ Delete tasks
* 📅 Automatically stores the creation date of each task
* 🎨 Modern UI built with Jetpack Compose
* 🏛️ MVVM Architecture
* 📱 Material 3 Design
---

## 🛠️ Tech Stack

* **Language:** Kotlin
* **UI:** Jetpack Compose
* **Architecture:** MVVM (Model-View-ViewModel)
* **State Management:** LiveData
* **IDE:** Android Studio
* **Design:** Material 3

---

## 📂 Project Structure

```
app/
│
├── ui/
│   ├── TodoListPage.kt
│   ├── TodoItem.kt
│   └── theme/
│
├── viewmodel/
│   └── TodoViewModel.kt
│
├── manager/
│   └── TodoManager.kt
│
├── model/
│   └── Todo.kt
│
└── MainActivity.kt
```

---

## 🚀 Getting Started

### Prerequisites

* Android Studio (Latest Version)
* JDK 11 or above
* Android SDK 24+

---

## 📱 How It Works

1. Enter a task in the text field.
2. Tap the **Add** button.
3. The task is added to the list with the current date.
4. Tap the **Delete** icon to remove a task.

---

## 📦 Dependencies

* Jetpack Compose
* Material 3
* Lifecycle ViewModel
* LiveData
* Compose Runtime
* Activity Compose

---

## 🏗️ Architecture

The project follows the **MVVM (Model-View-ViewModel)** architecture.

```
UI (Jetpack Compose)
        │
        ▼
ViewModel
        │
        ▼
TodoManager
        │
        ▼
Todo Data Model
```

---

## 📈 Future Improvements

* ✅ Room Database
* ✅ Edit existing tasks
* ✅ Task completion status
* ✅ Search functionality
* ✅ Categories
* ✅ Dark Mode
* ✅ Notifications & Reminders
* ✅ Firebase Sync
* ✅ StateFlow instead of LiveData



