//package edu.ada.micronaut.service.impl;
//
//import edu.umd.cs.findbugs.annotations.Nullable;
//import io.micronaut.http.HttpRequest;
//import io.micronaut.security.authentication.*;
//import io.reactivex.Flowable;
//import org.reactivestreams.Publisher;
//
//import javax.inject.Inject;
//import javax.inject.Singleton;
//import java.util.Collections;
//
//@Singleton
//public class UserPasswordAuthProvider implements AuthenticationProvider {
//
//    @Inject
//    UserStore store;
//
//    @Override
//    public Publisher<AuthenticationResponse> authenticate(@Nullable HttpRequest<?> httpRequest, AuthenticationRequest<?, ?> req) {
//        String username = req.getIdentity().toString();
//        String password = req.getSecret().toString();
//        if (password.equals(store.getUserPassword(username))) {
//            UserDetails details = new UserDetails(username, Collections.singletonList(store.getUserRole(username)));
//            return Flowable.just(details);
//        } else {
//            return Flowable.just(new AuthenticationFailed());
//        }
//    }
//}
