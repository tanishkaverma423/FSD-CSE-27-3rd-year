# Classroom Finder

React frontend + Java Spring Boot backend for finding classrooms that are free during a selected day/time.

## Run on Windows without installing Maven

Requirements: Java 17+ and Node.js.

### Terminal 1 - backend
From the project root:

```powershell
cd backend
..\mvnw.cmd spring-boot:run
```

The first run downloads Maven automatically. Then the backend runs on http://localhost:8080.

### Terminal 2 - frontend
From the project root:

```powershell
cd frontend
npm install
npm run dev
```

Open the localhost URL shown by Vite, usually http://localhost:5173.

## Project structure

- `frontend/` = React UI
- `backend/` = Java Spring Boot API
- `backend/src/main/java/.../data/TimetableData.java` = sample rooms and lectures
- `backend/src/main/java/.../controller/RoomController.java` = free-room logic
