# FocusFlow — Smart Study & Productivity Planner

A frontend-only React study planner. No backend or database is required.

## Requirements
- Node.js (LTS)
- VS Code (recommended)

## Run the project
1. Extract `focusflow-react-frontend.zip`.
2. Open the `focusflow` folder in VS Code.
3. Open the terminal in VS Code.
4. Run:

```bash
npm install
npm run dev
```

5. Open the local URL printed in the terminal (usually http://localhost:5173).

## Features
- Dashboard with task and study statistics
- Add, edit, delete, complete and search tasks
- Subject management
- 25-minute focus / 5-minute break Pomodoro timer
- Monthly calendar with task deadlines
- Weekly focus-time chart and study streak
- Profile and daily study goal settings
- Responsive layout for desktop and mobile

## Data storage
The app saves tasks, subjects, focus sessions and settings in browser Local Storage. Data stays in the same browser on the same device. Clearing browser site data or using a different browser/device will not carry the data over.

## Main React concepts
- `useState`: form inputs, filters, calendar month and timer state
- `useEffect`: Local Storage persistence and timer interval
- `useReducer`: central app data updates
- `useContext`: sharing app data between components
- Custom hook: `usePersistentReducer`
