package ru.job4j.collection.bank;

import ru.job4j.converter.Converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }
    public User findByPassport(String passport) {
        return users.keySet().stream().filter(u -> u.getPassport().equals(passport)).findFirst().orElse(null);
    }
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
           return users.get(user).stream().filter(a -> a.getRequisite().equals(requisite)).findFirst().orElse(null);
        }
        return null;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if ((destAccount != null) && (srcAccount != null)) {
            if (srcAccount.getBalance() >= amount) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}