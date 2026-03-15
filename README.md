# TerminalBuffer

This is a task for JetBrains Internship 2026.

# Task

Implement a <b>terminal text buffer</b> — the core data structure that terminal emulators use to store and manipulate displayed text.

When a shell sends output, the terminal emulator updates this buffer, and the UI renders it.

A terminal buffer consists of a grid of <b>character cells</b>. Each cell can have:
- Character (or empty)
- Foreground color: default, or one of 16 standard terminal colors
- Background color: default, or one of 16 standard terminal colors
- Style flags: bold, italic, underline (at minimum)

The buffer maintains a <b>cursor position</b> — where the next character will be written.

The buffer has two logical parts:
- <b>Screen</b> — the last N lines that fit the screen dimensions (e.g., 80×24). This is the editable part and what users see.
- <b>Scrollback</b> — lines that scrolled off the top of the screen, preserved for history and unmodifiable. Users can scroll up to view them.

<b>Terminal buffer requirements</b>

<b>Basic operations</b>

Implement a `TerminalBuffer` class (or equivalent) supporting the following operations:

<b>Setup</b>
- Configurable initial width and height
- Configurable scrollback maximum size (number of lines)

<b>Attributes</b>
- Set current attributes: foreground, background and styles. These attributes should be used for further edits.

<b>Cursor</b>
- Get/set cursor position (column, row)
- Move cursor: up, down, left, right by N cells
- Cursor must not move outside screen bounds

<b>Editing</b>

Operations that should take the current cursor position and attributes into account:

- Write a text on a line, overriding the current content. Moves the cursor.
- Insert a text on a line, possibly wrapping the line. Moves the cursor.
- Fill a line with a character (or empty)

Operations that do not depend on cursor position or attributes:
- Insert an empty line at the bottom of the screen
- Clear the entire screen
- Clear the screen and scrollback

<b>Content Access</b>
- Get character at position (from screen and scrollback)
- Get attributes at position (from screen and scrollback)
- Get line as string (from screen and scrollback)
- Get entire screen content as string
- Get entire screen+scrollback content as string


<b>Bonus</b>

If you complete the core requirements and want an extra challenge:

- <b>Wide characters</b>: Some characters (e.g., CJK ideographs, emoji) occupy 2 cells in terminals. Handle writing and cursor movement for such characters.
- <b>Resize</b>: change the dimensions of the screen (content handling strategy is your design decision)

# Technical Constraints

- <b>Language</b>: `Java` or `Kotlin`
- <b>No external libraries</b> except for testing (any test framework is allowed)
- <b>Build tool</b>: `Gradle` or `Maven`

# Expected results

Explain the solution, trade-offs and decisions you made before submitting the task.
If you have any improvements in your mind but didn't have time to implement them, mention them as well.

Attach a link to a <b>public Git repository</b> (`GitHub`, `GitLab`, etc.).
The repository should contain:

- Source code
- Build file that compiles
- Unit Tests:
    - Comperhensive test coverage
    - Edge cases and boundary conditions
    - Tests should document expected behavior
- Git history:
    - Incremental commits showing the development process
    - Clear, descriptive commit messages
    - Separation of adding new features and refactorings


# TODO
- [x] Character cell style
    - [x] Foreground color
    - [x] Background color
    - [x] Style flags
- [ ] Terminal Cell class
- [ ] TerminalBuffer class
    - [ ] Screen
    - [ ] Scrollback
    - [ ] Setup
      - [ ] Configurable initial width and height
      - [ ] Configurable scrollback buffer size (number of lines)
    - [ ] Attributes
      - [ ] Set current attributes: foreground, background and styles. These attributes should be used for further edits.
    - [ ] Cursor
      - [ ] Get/set a cursor position (column, row)
      - [ ] Move cursor: up, down, left, right by N cells
      - [ ] Cursor must not move outside screen bounds
    - [ ] Editing
      - [ ] Write a text on a line, overriding the current content. Moves the cursor.
      - [ ] Insert a text on a line, possibly wrapping the line. Moves the cursor.
      - [ ] Fill a line with a character (or empty)
      - [ ] Insert an empty line at the bottom of the screen
      - [ ] Clear the entire screen
      - [ ] Clear the screen and scrollback
    - [ ] Content access
      - [ ] Get character at the chosen position (from screen and scrollback)
      - [ ] Get attributes at position (from screen and scrollback)
      - [ ] Get line as string (from screen and scrollback)
      - [ ] Get entire screen content as a string
      - [ ] Get the entire screen + scrollback content as string
- [ ] Bonus
    - [ ] Wide characters
      - [ ] Add support for wide characters (e.g, CJK ideographs, emoji which occupy 2 cells in terminal)
      - [ ] Handle writing of such characters
      - [ ] Handle cursor movement for such characters
    - [ ] Resize
      - [ ] Change the dimensions of the screen
      - [ ] Add content handling for the new screen size
- [ ] Documentation
- [ ] Tests