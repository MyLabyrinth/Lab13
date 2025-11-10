# Lab 13

## Recap: Lab (Github) Workflow 📄 - How to Work on Labs

Follow these steps for every lab carefully to access, complete, and submit your assignment.

1.  **Accept the Assignment**

    - Open the Lab Assignment Link the professor provided.
    - Click **"Accept the assignment"**. This will create your personal assignment repository on GitHub under the `OOP-Fall-2025` organization.
    - You'll be taken to your repository page. Verify that the URL looks like `github.com/OOP-Fall-2025/lab-number-yourusername`.

2.  **Clone the Repository to Your Computer**

    - On your repository page, click the blue **`<> Code`** button.
    - In the dropdown menu, choose **"Open with GitHub Desktop"**.
    - GitHub Desktop will launch. Choose a preferred local folder on your computer to save the project and click **"Clone"**.
    - If asked "How are you planning on using this fork?", select **"For my own purpose"** and continue.

3.  **Open in VS Code and Start Coding**

    - In GitHub Desktop, ensure the "Current repository" is the one for this lab.
    - Click the **"Open in Visual Studio Code"** button.
    - VS Code will open the project folder. You can now begin writing your solutions in the `Lab13.java` file.

4.  **Save and Submit Your Work**

    - **Commit (Save) Changes**: As you work, save your file in VS Code (`Ctrl+S` or `Cmd+S`). To record your progress, go to the **Source Control** tab (the fork icon) on the left sidebar in VS Code. Type a descriptive message in the message box (e.g., "Finished Lab 13") and click **"Commit"**. You must enter a message.
    - **Push (Submit) to GitHub**: When you are finished with the lab or want to back up your work, go back to GitHub Desktop. Click the **"Push origin"** button at the top of the window. This sends your committed changes from your computer to your GitHub repository online.

5.  **Verify Your Submission**
    - After you push, you can click **"View on GitHub"** in GitHub Desktop to open your repository in the browser.
    - On the GitHub website, make sure you are viewing the `main` branch and confirm that all of your latest code is visible.

---

## Lab 13 Task

### Collections Framework: Epic Quest Achievement Tracker 🎮

_Build a complete game achievement system using Array, ArrayList, HashSet, HashMap, and LinkedList all in one task!_

---

## The Challenge

You are building the **Achievement System** for an epic fantasy video game! Track player progress by managing achievements across multiple collection types. When players complete quests and earn achievements, your system handles five different types of data:

- **Array**: Fixed player stats (Health, Mana, Stamina, Coins)
- **ArrayList**: Dynamic achievements earned by the player
- **HashSet**: Unique badges/trophies (prevent duplicates)
- **HashMap**: Achievement point values and details
- **LinkedList**: Achievement history timeline (most recent first)

This single task ties everything together into a real-world gaming system!

---

## Part 1: Initialize Player Stats (Array) ⚔️

Create an `int[] stats` array to store fixed player information.

**What to do:**
- Create an array with 4 elements: `{100, 50, 75, 500}`
  - Index 0: Health points
  - Index 1: Mana points
  - Index 2: Stamina points
  - Index 3: Coins (reward money)
- Access each stat by index and display with labels
- Display starting stats

**Example Output:**
```
=== EPIC QUEST ACHIEVEMENT TRACKER ===

--- Starting Player Stats ---
  Health: 100 HP
  Mana: 50 MP
  Stamina: 75 SP
  Coins: 500 💰
```

**Key Methods:**
```java
int[] stats = {100, 50, 75, 500};
stats[0]           // Access health
stats[3] += 50     // Add coins
stats.length       // Get array size
```

---

## Part 2: Load Achievement Definitions (HashMap) 📋

Create a `HashMap<String, Integer>` to store achievement names and their point rewards.

**What to do:**
- Create HashMap called `achievementPoints`
- Add these 5 achievements with `.put()`:
  - "Dragon Slayer" → 50 points
  - "Treasure Hunter" → 30 points
  - "Master Collector" → 40 points
  - "Speed Runner" → 25 points
  - "Boss Defeater" → 60 points
- Display all achievements using `.entrySet()` with enhanced for-each
- Show total achievement types using `.size()`

**Example Output:**
```
--- Achievement Point System Loaded ---
  Dragon Slayer: 50 pts
  Treasure Hunter: 30 pts
  Master Collector: 40 pts
  Speed Runner: 25 pts
  Boss Defeater: 60 pts

Total achievement types: 5
```

**Key Methods:**
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("key", 50)              // Add key-value pair
map.get("key")                  // Get value
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    entry.getKey()              // Get achievement name
    entry.getValue()            // Get point value
}
```

---

## Part 3: Earn Starting Achievements (ArrayList) ✨

Create an `ArrayList<String>` to store achievements earned by the player.

**What to do:**
- Create ArrayList called `earnedAchievements`
- Add these 3 starting achievements using `.add()`:
  - "Dragon Slayer"
  - "Treasure Hunter"
  - "Master Collector"
- Display all earned achievements using enhanced for-each
- For each achievement, use `.get()` on HashMap to look up point value and display it
- Show total achievements using `.size()`

**Example Output:**
```
--- Achievements Earned (3) ---
  ✓ Dragon Slayer (50 pts)
  ✓ Treasure Hunter (30 pts)
  ✓ Master Collector (40 pts)

Total achievements: 3
```

**Key Methods:**
```java
ArrayList<String> list = new ArrayList<>();
list.add("item")                // Add to end
list.contains("item")           // Check if exists
list.size()                     // Get count
for (String item : list) { }    // Enhanced for-each
```

---

## Part 4: Track Unique Badges (HashSet) 🏆

Create a `HashSet<String>` to store unique badges (no duplicates allowed).

**What to do:**
- Create HashSet called `uniqueBadges`
- Add the same 3 achievements from ArrayList to the HashSet using `.add()`
  - HashSet will automatically prevent duplicates
- Display all unique badges
- Show total unique badges using `.size()`
- Compare with ArrayList size to show that both are the same

**Example Output:**
```
--- Unique Badges Collected (3) ---
  🏆 Dragon Slayer
  🏆 Treasure Hunter
  🏆 Master Collector

Unique badge count: 3
```

**Key Methods:**
```java
HashSet<String> set = new HashSet<>();
set.add("item")                 // Add (duplicates ignored)
set.contains("item")            // Check if exists
set.size()                      // Get count of unique items
for (String item : set) { }     // Enhanced for-each
```

---

## Part 5: Build Achievement Timeline (LinkedList) ⏱️

Create a `LinkedList<String>` to store achievement history with most recent first.

**What to do:**
- Create LinkedList called `achievementHistory`
- Add achievement history using `.addFirst()` (adds to beginning - most recent first):
  - "Master Collector - Earned!"
  - "Treasure Hunter - Earned!"
  - "Dragon Slayer - Earned!"
- Display timeline using enhanced for-each with numbering
- This creates a reverse chronological order (newest to oldest)

**Example Output:**
```
--- Achievement Timeline (Newest to Oldest) ---
  1. Master Collector - Earned!
  2. Treasure Hunter - Earned!
  3. Dragon Slayer - Earned!
```

**Key Methods:**
```java
LinkedList<String> list = new LinkedList<>();
list.addFirst("item")           // Add to beginning (LIFO)
list.add("item")                // Add to end (FIFO)
list.get(0)                     // Get first item
list.removeFirst()              // Remove from beginning
list.size()                     // Get count
for (String item : list) { }    // Enhanced for-each
```

---

## Part 6: Attempt a New Achievement (Interactive) 🎯

Ask the player to attempt a new achievement they haven't earned yet.

**What to do:**
1. Ask: "Attempt a new achievement? (y/n)"
2. If yes, display available achievements NOT already earned:
   - Check `.contains()` on ArrayList to see what's not earned
   - Show "Speed Runner (25 pts)" and "Boss Defeater (60 pts)"
3. Ask user to pick 1 or 2
4. Complete quest simulation:
   - Use `.get()` on HashMap to look up the point value
   - Use `.contains()` on ArrayList to verify NOT already earned (safety check)
   - If NOT already earned:
     - Add to ArrayList with `.add()`
     - Add to HashSet with `.add()` (try adding duplicate to see it's prevented!)
     - Add to LinkedList with `.addFirst()` (most recent first)
     - Update coins in Array: `stats[3] += pointValue`
     - Display success with celebration emoji
   - If already earned: Display "Already have this achievement!"

**Example Output:**
```
Attempt a new achievement? (y/n): y

Available achievements:
  1. Speed Runner (25 pts)
  2. Boss Defeater (60 pts)

Which one? (1 or 2): 2

🎉 QUEST COMPLETE! Boss Defeater unlocked!
  + 60 reward points
  New coin total: 560 💰

Unique badges now: 4
```

---

## Part 7: Final Progress Report 📊

Display a comprehensive report showing all collections.

**What to do:**
1. **Display Array**: Show all 4 player stats by index
2. **Display ArrayList**: Show all earned achievements with points looked up from HashMap
3. **Display HashSet**: Show unique badge count using `.size()`
4. **Display HashMap**: Calculate total points by looking up each earned achievement
5. **Display LinkedList**: Show timeline of achievements (most recent first)
6. **Calculate Achievement %**: How many of 5 total achievements earned?

**Example Output:**
```
=== FINAL PROGRESS REPORT ===

--- Player Stats (Array) ---
  Health: 100 HP
  Mana: 50 MP
  Stamina: 75 SP
  Coins: 560 💰

--- All Achievements Earned (ArrayList - 4 total) ---
  1. Dragon Slayer (50 pts)
  2. Treasure Hunter (30 pts)
  3. Master Collector (40 pts)
  4. Boss Defeater (60 pts)

--- Unique Badges (HashSet) ---
Total unique badges: 4

--- Achievement Timeline (LinkedList - Most Recent First) ---
  1. Boss Defeater - Earned!
  2. Master Collector - Earned!
  3. Treasure Hunter - Earned!
  4. Dragon Slayer - Earned!

--- Overall Stats ---
Total Points Earned: 180 pts
Completion: 4 out of 5 achievements (80%)
```

---

## Collections Quick Reference

### Array
```java
int[] stats = {100, 50, 75, 500};
stats[0]           // Access by index
stats[3] += 50     // Modify value
stats.length       // Get size
```

### HashMap
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("key", 50)              // Add/update
map.get("key")                  // Get value
map.containsKey("key")          // Check if key exists
map.size()                      // Get count
for (Map.Entry<String, Integer> e : map.entrySet()) {
    e.getKey()                  // Get key
    e.getValue()                // Get value
}
```

### ArrayList
```java
ArrayList<String> list = new ArrayList<>();
list.add("item")                // Add to end
list.contains("item")           // Check if exists
list.size()                     // Get count
for (String item : list) { }    // Enhanced for-each
```

### HashSet
```java
HashSet<String> set = new HashSet<>();
set.add("item")                 // Add (duplicates ignored!)
set.contains("item")            // Check if exists
set.size()                      // Get count
for (String item : set) { }     // Enhanced for-each
```

### LinkedList
```java
LinkedList<String> list = new LinkedList<>();
list.addFirst("item")           // Add to beginning
list.add("item")                // Add to end
list.get(0)                     // Get first item
list.removeFirst()              // Remove from beginning
list.size()                     // Get count
for (String item : list) { }    // Enhanced for-each
```

---

## Why Each Collection?

| Collection | Used For | Why |
| ---------- | -------- | --- |
| **Array** | Fixed player stats | Size never changes (always 4 stats) |
| **HashMap** | Achievement details | Fast lookup by achievement name (O(1)) |
| **ArrayList** | Achievements earned | Dynamic list that grows as player progresses |
| **HashSet** | Unique badges | Automatically prevent duplicate badges |
| **LinkedList** | Achievement history | Easy to add newest to front with `.addFirst()` |

---

## Common Mistakes to Avoid

| ❌ Wrong | ✅ Correct |
| ------- | --------- |
| `int[] stats = new int[3]` then use `stats[5]` | Check array length first - use `.length` |
| `ArrayList<String> list = new HashMap<>();` | Match types: `new ArrayList<>()` |
| `.get("key")` on HashMap without checking if exists | Use `.containsKey()` first to avoid null |
| `.add()` duplicate to HashSet and expect duplicates | HashSet automatically prevents duplicates! |
| Forgetting to use `.addFirst()` in LinkedList | Use `.addFirst()` to add to beginning |
| `achievementPoints.get("Dragon Slayer")` returns null | Make sure string matches exactly |
| Not checking `.contains()` before adding | Verify achievement not already earned |
| Trying to access array index beyond size | Always use index 0-3 for 4-element array |

---

## Import Statements Required

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;  // For Map.Entry
import java.util.Scanner;
```

---

## Need Help?

Ask your instructor! Reference materials available:

- Java Collections Framework documentation
- Array: Fixed-size storage by index
- ArrayList: Dynamic ordered collection
- HashSet: Unique items only
- HashMap: Key-value fast lookup
- LinkedList: Ordered with efficient beginning operations

## Finished?

When done with the lab (committed and pushed on GitHub), show instructor and state your name to be marked as done!

---

## Bonus: Extensions (If You Finish Early)

### Extension 1: Loop Multiple Attempts
Allow players to attempt achievements in a loop. Keep asking "Want to attempt another achievement?" until they say no. Track total number of attempts.

### Extension 2: Achievement Descriptions
Modify HashMap to store both points AND descriptions: `HashMap<String, String>` with values like "Dragon Slayer (50 pts) - Defeat a dragon boss"

### Extension 3: Milestone Badges
Every 2 achievements earned, award special milestone badges (stored in HashSet as "2x Achiever", "4x Achiever", etc.)

### Extension 4: Stat Bonuses
When earning certain achievements, boost player stats. For example, "Boss Defeater" increases Health by 10, "Treasure Hunter" adds 50 coins, etc.

### Extension 5: Achievement Search
Ask user to search for an achievement by name in the LinkedList history to see when it was earned. Display position in timeline.

Good luck! 🎮✨
