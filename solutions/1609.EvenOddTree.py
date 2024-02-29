class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def isEvenOddTree(self, root):
        queue = [root]
        level = 0
        while queue:
            new_queue = []
            prev_value = None
            for node in queue:
                if level % 2 == 0:
                    if node.val % 2 == 0:
                        return False
                else:
                    if node.val % 2 != 0:
                        return False
                if prev_value is not None:
                    if level % 2 == 0 and node.val <= prev_value:
                        return False
                    if level % 2 == 1 and node.val >= prev_value:
                        return False
                prev_value = node.val
                if node.left:
                    new_queue.append(node.left)
                if node.right:
                    new_queue.append(node.right)
            queue = new_queue
            level += 1
        return True
