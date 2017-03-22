import { BettingerPage } from './app.po';

describe('bettinger App', () => {
  let page: BettingerPage;

  beforeEach(() => {
    page = new BettingerPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
