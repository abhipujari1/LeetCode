class Solution {
    public int numUniqueEmails(String[] emails) {
      Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            StringBuilder normalizedEmail = new StringBuilder();
            int atIndex = email.indexOf('@');
            String localName = email.substring(0, atIndex);
            String domainName = email.substring(atIndex);

          
            for (char c : localName.toCharArray()) {
                if (c == '+') break;
                if (c != '.') normalizedEmail.append(c);
            }

            uniqueEmails.add(normalizedEmail.toString() + domainName);
        }

        return uniqueEmails.size();  
    }
}