package com.ibm.trainning.emart.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ibm.trainning.emart.entity.Buyer;
import com.ibm.trainning.emart.entity.Seller;
import com.ibm.trainning.emart.entity.User;
import com.ibm.trainning.emart.repository.BuyerRep;
import com.ibm.trainning.emart.repository.SellerRep;
import com.ibm.trainning.emart.repository.UserRep;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	UserRep userRep;
	@Autowired
	BuyerRep buyerRep;
	@Autowired
	SellerRep sellerRep;
	
	public User getUser(String username) {
		return userRep.findOneByUsername(username);
	}
	

	public Long createBuyer(Buyer buyer) {
		return buyerRep.save(buyer).getId();
	}

	public Long createSell(Seller seller) {
		return sellerRep.save(seller).getId();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRep.findOneByUsername(username);
		// TODO Auto-generated method stub
		return user == null? null: new UserDetails() {

			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getPassword() {
				// TODO Auto-generated method stub
				return user.getPassword();
			}

			@Override
			public String getUsername() {
				// TODO Auto-generated method stub
				return user.getUsername();
			}

			@Override
			public boolean isAccountNonExpired() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isAccountNonLocked() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isCredentialsNonExpired() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return true;
			}
			
		};
	}
	
	
	
}
