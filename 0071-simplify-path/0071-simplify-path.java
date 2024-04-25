class Solution {
    public String simplifyPath(String path) {
                Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.equals(".") && !component.isEmpty()) {
                stack.push(component);
            }
        }

        StringBuilder canonicalPath = new StringBuilder("/");
        for (String dir : stack) {
            canonicalPath.append(dir).append("/");
        }

        if (canonicalPath.length() > 1) {
            canonicalPath.setLength(canonicalPath.length() - 1);
        }

        return canonicalPath.toString();

    }
}