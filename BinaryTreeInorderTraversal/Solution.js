/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */


var inorderTraversal = function(root) {
    var array = new Array();
    
    function inorder(root){
    if(root === null){
        return null;
    }  
    inorder(root.left);
    array.push(root.val)
    inorder(root.right);
    };
    
    inorder(root);
    return array;
};
