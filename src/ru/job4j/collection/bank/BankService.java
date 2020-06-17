package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().filter(u -> u.getPassport().equals(passport)).findFirst();
        //return users.keySet().stream().filter(u -> u.getPassport().equals(passport)).findFirst().orElse(null);
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream().filter(a -> a.getRequisite().equals(requisite)).findFirst());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if ((destAccount.isPresent()) && (srcAccount.isPresent())) {
            if (srcAccount.get().getBalance() >= amount) {
                destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}