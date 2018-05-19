import {Injectable} from '@angular/core';
import {AuthService} from './services/auth.service';
import {CanActivate, Router} from '@angular/router';

@Injectable()
export class AuthGuardService implements CanActivate {

  constructor(public auth: AuthService, public router: Router) {
  }

  canActivate(): boolean {
    if (!this.auth.isAuthenticated()) {
      this.router.navigate(['login']);
      return false;
    }
    return true;
  }
}
