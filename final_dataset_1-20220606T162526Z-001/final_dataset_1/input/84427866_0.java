public void populate() {
        // 清除已有数据
        customerRepository.deleteAll(); // Customer有一个外键引用Account，因此需要先删除Customer，然后才删除Account
        accountRepository.deleteAll();

        Account account = new Account("user", "12345");
        account.setDefaultAccount(true);

        Set<Address> addresses = new HashSet<>();
        Address address = new Address("中国", "云南", "丽江", "古城区", "street1", "street2", 000000, AddressType.SHIPPING);
        addresses.add(address);
        account.setAddresses(addresses);

        Set<CreditCard> creditCards = new HashSet<>();
        CreditCard creditCard = new CreditCard("6666666666666666", CreditCardType.VISA);
        creditCards.add(creditCard);
        account.setCreditCards(creditCards);

        //account = accountRepository.save(account); // spring data save方法的jpa实现是 EntityManager.persist方法，该方法不能persist detached entity, EntityManager.merge方法可以，但spring data jpa 未采用，所以 不单独保存，而是放到保存customer时使用级联保存。

        // 创建一个customer
        Customer customer = new Customer("Time", "Yang", "timeyang@timeyang.com", account);
        customerRepository.save(customer);
    }
