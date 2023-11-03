#include <stdio.h>
#include <stdlib.h>

// Define a structure for a node in the singly linked list.
struct Node {
    int data;
    struct Node* next;
};

// Function to insert a node at the beginning of the list.
struct Node* insertAtBeginning(struct Node* head, int data) {
    // Create a new node.
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));

    if (newNode == NULL) {
        // Memory allocation failed.
        printf("Memory allocation failed.\n");
        return head;
    }

    // Set the data for the new node.
    newNode->data = data;

    // Point the new node to the current head of the list.
    newNode->next = head;

    // Update the head pointer to the new node.
    head = newNode;

    return head;
}

// Function to display the linked list.
void displayList(struct Node* head) {
    struct Node* current = head;

    if (current == NULL) {
        printf("The list is empty.\n");
        return;
    }

    printf("Linked List: ");
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

// Main function to test the insertion at the beginning.
int main() {
    struct Node* head = NULL; // Initialize an empty list.
    int data;
    int numNodes;

    printf("Enter the number of nodes: ");
    scanf("%d", &numNodes);

    for (int i = 0; i < numNodes; i++) {
        printf("Enter data for node %d: ", i + 1);
        scanf("%d", &data);
        head = insertAtBeginning(head, data);
    }

    // Display the updated list.
    displayList(head);

    // Free memory for the nodes (cleanup).
    while (head != NULL) {
        struct Node* temp = head;
        head = head->next;
        free(temp);
    }

    return 0;
}
