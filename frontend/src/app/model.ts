export class User {
  id: number;
  username: string;
  name: string;
  surname: string;
  email: string;
  city: string;
  number: string;
  role: string;
  passwordHash: string;
}
export class ChangePasssword {
  oldPw: string;
  newPw: string;
}
