#include <iostream>

using namespace std;

// Define the structure for a node in the binary tree
struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = nullptr;
        right = nullptr;
    }
};

// Function to count the number of nodes in the binary tree
int countNodes(Node* root) {
    if (root == nullptr)
        return 0;
    else
        return 1 + countNodes(root->left) + countNodes(root->right);
}

int main() {
    
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);

    // Count nodes
    int numNodes = countNodes(root);
    cout << "Number of nodes in the binary tree: " << numNodes << endl;

    return 0;
}
