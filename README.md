# AdjacentGraphList


The code begins by creating a Scanner object to input data.

Next, the code creates two arrays: vertices and edges.

The vertices array contains the list of strings that represent the vertices in the graph, 
while the edges array contains the list of strings that represent the connections between those vertices.

Next, the code creates a LinkedList object called adjacentList and stores it in memory.
The adjacentList object is used to store all of the pairs of vertices that are adjacent to each other.

For each vertex invertes its coordinates (from left-to-right), looking for any vertex whose coordinate matches that of vertex .
If such a match exists, then adjacentList will contain an entry for vertex and another entry for .
Otherwise, adjacentList will not have an entry for and will be empty.

The next step is to populate adjacentList with pairs of vertices.
To do this, the code loops through all of the strings inverts their coordinates (separated by commas) 
and stores them in variables named i and j .

Then it uses these variables to add entries to adjacentList as follows: if finds an edge betweenandand therefore has coordinates , then it adds an entry fortoadjacentList;
The code creates a list of adjacent vertices in a graph.

The adjacent vertices are those that are connected by a single edge.
The code first creates a list of vertices and then loops through the vertices, creating a new linked list for each vertex.

For each vertex, the code checks to see if the vertex is adjacent to any other vertices.
If it is, the code adds the vertex's value to the adjacentList list.
Finally, the code prints out the contents of the adjacentList list.
