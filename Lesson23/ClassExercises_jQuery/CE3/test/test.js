console.log = function() {};
const assert = require('chai').assert;
const fs = require('fs');
const Structured = require('structured');

const code = fs.readFileSync('js/main.js', 'utf8');

describe('', function () {
  it('', function() {
    let structure = function() {
      $('.login-button').on('click', () => {
        $('.login-form').toggle();
      });  
    };

    let isMatch = Structured.match(code, structure);
    let failureMessage = 'Did you copy and paste the code from the task into main.js?';
    assert.isOk(isMatch, failureMessage);
  });
});