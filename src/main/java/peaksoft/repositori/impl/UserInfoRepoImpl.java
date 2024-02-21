package peaksoft.repositori.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import peaksoft.entity.UserInfo;
import peaksoft.repositori.UserInfoRepo;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class UserInfoRepoImpl  implements UserInfoRepo {
    @PersistenceContext
    private final EntityManager entityManager;
    @Override
    public List<UserInfo> findAll() {
        return entityManager.createQuery("select u from UserInfo  u " ,UserInfo.class).getResultList();
    }

    @Override
    public void save(UserInfo userInfo) {

    }

    @Override
    public UserInfo findById(Long Id) {
        return null;
    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public void updateById(Long Id, UserInfo newEntity) {

    }
}
