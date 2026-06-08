bool checkPangram(string &s) {
    vector<bool> seen(26, false);

    for (char ch : s) {
        if (isalpha(ch)) {
            ch = tolower(ch);
            seen[ch - 'a'] = true;
        }
    }

    for (bool v : seen) {
        if (!v) return false;
    }

    return true;
}