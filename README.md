# TerminalBuffer

This is a task for JetBrains Internship 2026.

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