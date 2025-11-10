// ============================================
// IMPORTS: Import required packages here
// TODO: Import ArrayList from java.util
// TODO: Import HashMap from java.util
// TODO: Import HashSet from java.util
// TODO: Import LinkedList from java.util
// TODO: Import Map from java.util
// TODO: Import Scanner from java.util
// ============================================



// Main class - entry point of the program
public class Lab13 {
    
    public static void main(String[] args) {
        
        // Create Scanner for user input
        // TODO: Create a Scanner object to read from System.in
        
        
        // ============================================
        // EPIC QUEST ACHIEVEMENT TRACKER
        // ONE COMPREHENSIVE TASK WITH ALL COLLECTIONS!
        // ============================================
        
        System.out.println("=== EPIC QUEST ACHIEVEMENT TRACKER ===\n");
        
        
        // ============================================
        // PART 1: INITIALIZE PLAYER STATS (Array) ⚔️
        // ============================================
        
        System.out.println("--- Starting Player Stats ---");
        
        // TODO: Create an int[] array called stats with 4 elements: {100, 50, 75, 500}
        // Index 0: Health
        // Index 1: Mana
        // Index 2: Stamina
        // Index 3: Coins
        
        
        
        // TODO: Display stats by accessing array indices
        System.out.println("  Health: " + stats[_________________] + " HP");
        System.out.println("  Mana: " + stats[_________________] + " MP");
        System.out.println("  Stamina: " + stats[_________________] + " SP");
        System.out.println("  Coins: " + stats[_________________] + " 💰");
        System.out.println();
        
        
        // ============================================
        // PART 2: LOAD ACHIEVEMENT DEFINITIONS (HashMap) 📋
        // ============================================
        
        // TODO: Create a HashMap<String, Integer> called achievementPoints
        
        
        // TODO: Add these 5 achievements with .put():
        // "Dragon Slayer" -> 50
        // "Treasure Hunter" -> 30
        // "Master Collector" -> 40
        // "Speed Runner" -> 25
        // "Boss Defeater" -> 60
        
        
        
        
        
        
        System.out.println("--- Achievement Point System Loaded ---");
        
        // TODO: Display all achievements using .entrySet() with enhanced for-each
        for (_________________ entry : achievementPoints._________________()) {
            System.out.println("  " + entry._________________ + ": " + entry._________________() + " pts");
        }
        
        System.out.println("\nTotal achievement types: " + achievementPoints._________________());
        System.out.println();
        
        
        // ============================================
        // PART 3: EARN STARTING ACHIEVEMENTS (ArrayList) ✨
        // ============================================
        
        // TODO: Create an ArrayList<String> called earnedAchievements
        
        
        // TODO: Add these 3 starting achievements with .add():
        // "Dragon Slayer"
        // "Treasure Hunter"
        // "Master Collector"
        
        
        
        
        
        System.out.println("--- Achievements Earned (" + earnedAchievements._________________ + ") ---");
        
        // TODO: Display each earned achievement
        // Use enhanced for-each on ArrayList
        // Use .get() on HashMap to look up point value for each
        for (String _________________ : _________________) {
            Integer points = achievementPoints._________________(_________________);
            System.out.println("  ✓ " + _________________ + " (" + points + " pts)");
        }
        
        System.out.println("\nTotal achievements: " + earnedAchievements._________________());
        System.out.println();
        
        
        // ============================================
        // PART 4: TRACK UNIQUE BADGES (HashSet) 🏆
        // ============================================
        
        // TODO: Create a HashSet<String> called uniqueBadges
        
        
        // TODO: Add the same 3 achievements to the HashSet
        // (HashSet will prevent duplicates automatically!)
        uniqueBadges._________________("Dragon Slayer");
        uniqueBadges._________________("Treasure Hunter");
        uniqueBadges._________________("Master Collector");
        
        System.out.println("--- Unique Badges Collected (" + uniqueBadges._________________ + ") ---");
        
        // TODO: Display all unique badges using enhanced for-each
        for (String _________________ : _________________) {
            System.out.println("  🏆 " + _________________);
        }
        
        System.out.println("\nUnique badge count: " + uniqueBadges._________________());
        System.out.println();
        
        
        // ============================================
        // PART 5: BUILD ACHIEVEMENT TIMELINE (LinkedList) ⏱️
        // ============================================
        
        // TODO: Create a LinkedList<String> called achievementHistory
        
        
        // TODO: Add achievement history using .addFirst() to add to BEGINNING (newest first)
        achievementHistory._________________("Master Collector - Earned!");
        achievementHistory._________________("Treasure Hunter - Earned!");
        achievementHistory._________________("Dragon Slayer - Earned!");
        
        System.out.println("--- Achievement Timeline (Newest to Oldest) ---");
        
        // TODO: Display timeline with numbering using enhanced for-each
        int timelineNum = 1;
        for (String _________________ : _________________) {
            System.out.println("  " + timelineNum + ". " + _________________);
            timelineNum++;
        }
        
        System.out.println();
        
        
        // ============================================
        // PART 6: ATTEMPT A NEW ACHIEVEMENT (Interactive) 🎯
        // ============================================
        
        System.out.print("Attempt a new achievement? (y/n): ");
        String attemptNew = scanner.nextLine().toLowerCase();
        
        if (attemptNew.equals("y")) {
            System.out.println("\nAvailable achievements:");
            System.out.println("  1. Speed Runner (25 pts)");
            System.out.println("  2. Boss Defeater (60 pts)");
            
            System.out.print("\nWhich one? (1 or 2): ");
            String choice = scanner.nextLine();
            
            String selectedAchievement = "";
            int selectedPoints = 0;
            
            if (choice.equals("1")) {
                selectedAchievement = "Speed Runner";
            } else if (choice.equals("2")) {
                selectedAchievement = "Boss Defeater";
            }
            
            // TODO: Use .get() on HashMap to look up point value
            if (!selectedAchievement.isEmpty()) {
                selectedPoints = achievementPoints.___________________(selectedAchievement);
                
                // TODO: Use .contains() on ArrayList to check if already earned
                if (earnedAchievements.___________________(selectedAchievement)) {
                    System.out.println("✗ Already have this achievement!");
                } else {
                    // Earn the new achievement!
                    
                    // TODO: Add to ArrayList with .add()
                    earnedAchievements.___________________(selectedAchievement);
                    
                    // TODO: Add to HashSet with .add() (try adding duplicate if applicable)
                    uniqueBadges.___________________(selectedAchievement);
                    
                    // TODO: Add to LinkedList with .addFirst() (newest first!)
                    achievementHistory.___________________(selectedAchievement + " - Earned!");
                    
                    // TODO: Update coins in Array by adding to stats[3]
                    stats[3] += selectedPoints;
                    
                    System.out.println("\n🎉 QUEST COMPLETE! " + selectedAchievement + " unlocked!");
                    System.out.println("  + " + selectedPoints + " reward points");
                    System.out.println("  New coin total: " + stats[3] + " 💰");
                    System.out.println("\nUnique badges now: " + uniqueBadges._________________());
                }
            }
        }
        
        System.out.println();
        
        
        // ============================================
        // PART 7: FINAL PROGRESS REPORT 📊
        // ============================================
        
        System.out.println("=== FINAL PROGRESS REPORT ===\n");
        
        System.out.println("--- Player Stats (Array) ---");
        // TODO: Display stats using array indices
        System.out.println("  Health: " + stats[_________________] + " HP");
        System.out.println("  Mana: " + stats[_________________] + " MP");
        System.out.println("  Stamina: " + stats[_________________] + " SP");
        System.out.println("  Coins: " + stats[_________________] + " 💰");
        System.out.println();
        
        System.out.println("--- All Achievements Earned (ArrayList - " + earnedAchievements._________________ + " total) ---");
        // TODO: Display all earned achievements with point lookup
        int achieveNum = 1;
        int totalPoints = 0;
        for (String _________________ : _________________) {
            Integer pts = achievementPoints._________________(_________________);
            System.out.println("  " + achieveNum + ". " + _________________ + " (" + pts + " pts)");
            totalPoints += pts;
            achieveNum++;
        }
        System.out.println();
        
        System.out.println("--- Unique Badges (HashSet) ---");
        // TODO: Display unique badge count using .size()
        System.out.println("Total unique badges: " + uniqueBadges._________________());
        System.out.println();
        
        System.out.println("--- Achievement Timeline (LinkedList - Most Recent First) ---");
        // TODO: Display timeline from LinkedList
        int historyNum = 1;
        for (String _________________ : _________________) {
            System.out.println("  " + historyNum + ". " + _________________);
            historyNum++;
        }
        System.out.println();
        
        System.out.println("--- Overall Stats ---");
        System.out.println("Total Points Earned: " + totalPoints + " pts");
        // TODO: Calculate completion percentage (earned achievements / 5 total)
        int completionPercent = (earnedAchievements._________________ * 100) / 5;
        System.out.println("Completion: " + earnedAchievements._________________ + " out of 5 achievements (" + completionPercent + "%)");
        
        // TODO: Close the scanner
        
    }
}


// ============================================
// DATA STRUCTURES REFERENCE
// ============================================

/*
 * ===== ARRAY =====
 * int[] stats = {100, 50, 75, 500};
 * stats[0]           // Access by index
 * stats[3] += 50     // Modify value
 * stats.length       // Get size
 * 
 * Use when: Size is fixed and never changes
 * 
 * ===== HASHMAP =====
 * HashMap<String, Integer> map = new HashMap<>();
 * map.put("key", 50)              // Add/update
 * map.get("key")                  // Get value (null if not found)
 * map.containsKey("key")          // Check if key exists
 * map.size()                      // Get count
 * for (Map.Entry<String, Integer> e : map.entrySet()) {
 *     e.getKey()                  // Get key
 *     e.getValue()                // Get value
 * }
 * 
 * Use when: Need fast lookup by key/name (O(1))
 * 
 * ===== ARRAYLIST =====
 * ArrayList<String> list = new ArrayList<>();
 * list.add("item")                // Add to end
 * list.contains("item")           // Check if exists
 * list.size()                     // Get count
 * list.get(0)                     // Get by index
 * for (String item : list) { }    // Enhanced for-each
 * 
 * Use when: Need dynamic ordered list that can grow
 * 
 * ===== HASHSET =====
 * HashSet<String> set = new HashSet<>();
 * set.add("item")                 // Add (duplicates ignored!)
 * set.contains("item")            // Check if exists
 * set.size()                      // Get count
 * for (String item : set) { }     // Enhanced for-each
 * 
 * Use when: Need unique items only, duplicates not allowed
 * 
 * ===== LINKEDLIST =====
 * LinkedList<String> list = new LinkedList<>();
 * list.addFirst("item")           // Add to beginning
 * list.add("item")                // Add to end
 * list.get(0)                     // Get first item
 * list.removeFirst()              // Remove from beginning
 * list.size()                     // Get count
 * for (String item : list) { }    // Enhanced for-each
 * 
 * Use when: Need ordered with efficient add/remove at beginning
 */
