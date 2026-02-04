🌊 Percolation Simulation (Java & JavaFX)

An interactive Percolation simulation built using Java and JavaFX.
The project visually demonstrates how water flows through a grid of open and blocked cells using the Union-Find (Disjoint Set Union) algorithm.




✨ Features

Clickable grid to open or block cells.

Percolation check from top to bottom.

Percolation path highlighted in light blue.

Reset button for repeated simulations.

Clean separation between GUI and logic.




🗂️ Project Structure

PercolationGUI.java – JavaFX interface with interactive grid, buttons, and status feedback.

Percolation.java – Core percolation logic with dual Union-Find to avoid backwash.

UnionFind.java – Optimized DSU with path compression and union by size.

🛠️ Technologies

Java 17+

JavaFX

Union-Find Algorithm

IntelliJ IDEA




🚀 How to Run

Clone the repository.

Open it in a Java IDE.

Configure JavaFX.

Run PercolationGUI.java.




🔮 Future Improvements

Water flow animations.

Dynamic grid size.

Live percolation statistics.

Web-based or 3D version.



This project is an interactive percolation simulation developed using Java and JavaFX.
It visually illustrates how water flows through a grid of open and blocked cells using the Union-Find algorithm.
The application allows users to interact with the grid, check percolation from top to bottom, 
and observe the percolation path in real time, providing a clear and educational demonstration of connectivity and percolation concepts.
