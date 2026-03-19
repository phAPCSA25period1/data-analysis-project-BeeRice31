[Pokemon Class Diagram.drawio](https://github.com/user-attachments/files/26124159/Pokemon.Class.Diagram.drawio)[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22635618)
# AP CSA Mini‑Project: Data Analysis with Arrays & File Input
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

---

## 📌 Project Overview
In this mini‑project, you will choose a dataset (CSV file), design a **custom class** to represent each row, read the dataset using the **Scanner** class, store all data as **objects** in an ArrayList or array, and answer a **guiding question** by analyzing the data.

This project reinforces:

- Arrays & ArrayLists  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (min, max, average, filtering)  
- Data quality & ethics  
- Documentation using **Javadoc**  
- Creating a **UML class diagram**  

By the end, you will produce insights and answer your original question using your program.

---

## 🎯 Your Task
You will:

1. **Choose a dataset** (teacher provided or public).  
2. **Write a guiding question** for your dataset.  
3. **Design a Java class** with ≥ 3 attributes.  
4. **Use `Scanner` to read a CSV file**, parse rows, and construct objects.  
5. **Store all objects** in an array or ArrayList.  
6. **Analyze the dataset** using algorithms you create.  
7. **Print insights** and answer your guiding question.  
8. **Document your code** with Javadoc.  
9. **Create a UML class diagram** representing your custom class.  

Optional stretch challenges are included at the bottom!

---

## 🧪 Example Questions You Might Ask
Your dataset might allow you to answer things like:

- *"Which Pokémon type has the highest average Attack?"*  
- *"Which U.S. state had the lowest obesity rate in 2020?"*  
- *"What country had the highest CO₂ emissions in 2000?"*  
- *"What is the average HP for Fire-type Pokémon?"*  

Think simple, clear, and answerable.

---

## 📁 Project Structure
Your repository should follow this structure:
```
/src
    Main.java
    YourClass.java
/data
    your_dataset.csv
README.md   ← this file
UML_Diagram.png (or UML_Diagram.pdf)
```

---

## 🧩 Step 1 — Choose Your Dataset

**Dataset Name:**  pokemon.csv
**Source / Link:**  https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/pokemon.csv

**What this dataset contains (2–3 sentences):**  
This dataset contains all original 151 pokemon, as well as information about their types, attack, defense, health, speed, sprite, and description.
  

---

## ❓ Step 2 — Write Your Guiding Question

Your guiding question should be something you can answer using your dataset.

**My guiding question:**  
What are the most common types from the original 151 pokemon?  
  

Examples:

- "Which Pokémon has the highest HP?"  
- "What is the average life expectancy in this dataset?"  
- "Which state had the highest vaccination rate?"  

---

## 🧱 Step 3 — Design Your Class

You must create a class that represents **one row** of your dataset.

### ✔ Your class must include:

- **At least 3 private attributes**  
- **A constructor** that takes all attributes as parameters  
- **Getter methods** for attributes you plan to analyze  
- **`toString()`** for easy printing  
- Any additional analysis/helper methods as needed  

### ✏ Include your class diagram

[Uploading Poke<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Safari/537.36" version="29.2.2">
  <diagram name="Page-1" id="h6NOGAyUe2-bVERtw4T8">
    <mxGraphModel dx="2066" dy="1103" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-9" parent="1" style="swimlane;fontStyle=0;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;fontSize=20;" value="Attributes" vertex="1">
          <mxGeometry height="330" width="380" x="190" y="250" as="geometry">
            <mxRectangle height="30" width="60" x="190" y="250" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-10" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- name : String" vertex="1">
          <mxGeometry height="30" width="380" y="30" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-11" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- pokedexNumber : int" vertex="1">
          <mxGeometry height="30" width="380" y="60" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-12" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- type1 : String" vertex="1">
          <mxGeometry height="30" width="380" y="90" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-20" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- type2 : String" vertex="1">
          <mxGeometry height="30" width="380" y="120" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-18" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- hp : int" vertex="1">
          <mxGeometry height="30" width="380" y="150" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-19" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- attack : int" vertex="1">
          <mxGeometry height="30" width="380" y="180" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-16" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- defense : int" vertex="1">
          <mxGeometry height="30" width="380" y="210" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-17" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- speed : int" vertex="1">
          <mxGeometry height="30" width="380" y="240" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-13" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- sprite : int" vertex="1">
          <mxGeometry height="30" width="380" y="270" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-15" parent="xSwNPgQ4qmbQMfYpyNG0-9" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="- description : String" vertex="1">
          <mxGeometry height="30" width="380" y="300" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-30" parent="1" style="swimlane;fontStyle=0;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;fontSize=20;" value="Methods" vertex="1">
          <mxGeometry height="360" width="380" x="190" y="580" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-31" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ Pokemon(...)" vertex="1">
          <mxGeometry height="30" width="380" y="30" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-32" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getName() : String" vertex="1">
          <mxGeometry height="30" width="380" y="60" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-34" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getPokedexNumber() : int" vertex="1">
          <mxGeometry height="30" width="380" y="90" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-36" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getType1() : String" vertex="1">
          <mxGeometry height="30" width="380" y="120" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-37" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getType2() : String" vertex="1">
          <mxGeometry height="30" width="380" y="150" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-38" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getHp() : int" vertex="1">
          <mxGeometry height="30" width="380" y="180" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-40" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getAttack() : int" vertex="1">
          <mxGeometry height="30" width="380" y="210" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-39" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getDefense() : int" vertex="1">
          <mxGeometry height="30" width="380" y="240" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-41" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getSprite() : String" vertex="1">
          <mxGeometry height="30" width="380" y="270" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-35" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ getDescription() : String" vertex="1">
          <mxGeometry height="30" width="380" y="300" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-33" parent="xSwNPgQ4qmbQMfYpyNG0-30" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=middle;spacingLeft=4;spacingRight=4;overflow=hidden;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;rotatable=0;whiteSpace=wrap;html=1;fontSize=20;" value="+ toString(): String" vertex="1">
          <mxGeometry height="30" width="380" y="330" as="geometry" />
        </mxCell>
        <mxCell id="xSwNPgQ4qmbQMfYpyNG0-43" parent="1" style="rounded=0;whiteSpace=wrap;html=1;" value="&lt;font style=&quot;font-size: 40px;&quot;&gt;Pokemon&lt;/font&gt;" vertex="1">
          <mxGeometry height="60" width="380" x="190" y="190" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
mon Class Diagram.drawio…]()

---

## 📥 Step 4 — Read Your CSV File Using Scanner

In `Main.java`, you must:

- Create a `File` object  
- Use `Scanner` to read the file  
- Skip the header row (if needed)  
- Read each line  
- Split by commas using `.split(",")`  
- Trim whitespace  
- Parse numbers using `Integer.parseInt()` or `Double.parseDouble()`  
- Construct objects  
- Add them to an ArrayList or array  

### Column → Attribute Map

| Attribute Name | CSV Column Name | Column Index # |                  Notes                  |
|----------------|-----------------|----------------|-----------------------------------------|
| pokedexNumber  | Number          | 0              | Unique identifier for each Pokemon      |
| name           | Pokemon         | 1              | The name of the Pokemon                 |
| type1          | Type 1          | 2              | Primary type (required)                 |
| type2          | Type 2          | 3              | Secondary type (optional, can be empty) |
| hp             | HP              | 4              | Hit Points stat                         |
| attack         | Attack          | 5              | Physical attack stat                    |
| defense        | Defense         | 6              | Physical defense stat                   |
| speed          | Speed           | 7              | Speed stat                              |
| sprite         | PNG             | 8              | URL to Pokemon sprite image             |
| description    | Description     | 9              | Text description of the Pokemon         |


---

## 📊 Step 5 — Analyze Your Data

You must write **at least two algorithms** to analyze your dataset.

### Required: Choose 2 or more algorithms
- [ ] Minimum value of attribute  
- [ ] Maximum value of attribute  
- [ ] Average of attribute  
- [ ] Filter by category  
- [ ] Count items matching a condition  

**Algorithms I will implement:**

1. Count types - Counts occurrences of each Pokemon type (both primary and secondary)
2. Compute average HP - Calculates the average HP stat across all Pokemon
3. Find maximum attack - Finds the highest attack stat value
4. Find minimum defense - Finds the lowest defense stat value
5. Find most common type - Determines which type appears most frequently  

Optional extras:  
- Sorting  
- Top/bottom N items  
- Grouping by category  
- Comparison between groups  

---

## 🧠 Step 6 — Insights & Answer to Your Question

After analyzing your objects, print:

- ✔ How many rows were loaded  
- ✔ Your algorithm results  
- ✔ A clear answer to your guiding question  

**My findings:**   
- Average HP across all Pokemon: 64.21  
- Maximum Attack stat: 134  
- Minimum Defense stat: 5  
- Type distribution: Water (32), Poison (33), Grass (14), Fire (12), Flying (19), Normal (24), Electric (9), Ground (14), Psychic (14), Rock (11), Ice (5), Fighting (8), Dragon (3), Ghost (3), Bug (12)  

**My answer to the guiding question:**  
The most common type among the original 151 Pokemon is Poison, appearing 33 times. Water is the second most common with 32 occurrences, followed by Normal with 24.  

---

## 📝 Step 7 — Documentation Requirements

### ✔ Javadoc Comments
You MUST use Javadoc for:

- Every **class**  
- Every **method**  
- Every **parameter**  
- Every **return value**  

Example:
```java
/**
 * Returns the highest HP among all Pokémon.
 * @param list the ArrayList of Pokémon objects
 * @return highest HP value in the dataset
 */
public static int findMaxHP(ArrayList<Pokemon> list) {
    // implementation
}
```

### ✔ UML Class Diagram
Add a UML diagram showing:

- Class name
- Attributes
- Methods
- Visibility (private/public)

Save as `UML_Diagram.png` or `.pdf` in the repo.

---

## 🛡 Step 8 — Data Ethics & Quality Reflection
Write a short reflection (3–5 sentences):

- What data-quality issues did you find?
- Could your dataset be biased?
- How might incomplete or inaccurate data affect results?
- How trustworthy are your insights?

**My reflection:**  
The data is the complete set of 151 pokemon with accurate stats and typing, and it comes from a trustworthy source on pokemon information. However, some descriptions may be off but that doesn't affect any 
statistical findings. On the other hand, the data is skewed towards water and poision type pokemon with dragon being by far the rarest meaning more in depth analysis of the dataset may be misleading.

---

## ⭐ Optional Challenges (Not Required but Fun!)

### 🔹 User Input
Allow the user to choose:

- Which attribute to analyze
- Which category to filter
- What statistics they want to calculate

### 🔹 Additional Algorithms

- Sorting objects
- Multiple comparisons
- Generating summaries
- Exporting results to a file

### 🔹 Data Cleaning

- Skip rows with missing values
- Detect invalid entries
- Normalize units

---

## ✅ Submission Checklist

- [x] Dataset selected
- [x] Guiding question written
- [x] Class created with ≥3 attributes
- [x] File reading implemented
- [x] ArrayList/array of objects created
- [x] At least 2 analysis algorithms implemented
- [x] Findings printed
- [x] Javadoc comments added
- [x] UML diagram included
- [x] Reflection completed
- [x] Code compiles & runs

---

Good luck, and have fun exploring your dataset! 🚀  
You're now doing real data analysis — just like professional software engineers.
